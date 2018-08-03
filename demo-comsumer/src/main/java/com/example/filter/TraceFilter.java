package com.example.filter;

import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//激活注解
@Activate(group = Constants.CONSUMER)
public class TraceFilter implements Filter {

    private static Logger logger = LoggerFactory.getLogger(TraceFilter.class);

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        String traceId = TraceContext.getTraceId();
        long start = System.currentTimeMillis();
        try {
            RpcContext.getContext().setAttachment("traceId", traceId);
            return invoker.invoke(invocation);
        } catch (Exception e) {
            logger.error("", e);
            throw e;
        } finally {
            long end = System.currentTimeMillis();
            logger.info("traceId:{},useTime:{}", traceId, (end - start));
        }


    }
}
