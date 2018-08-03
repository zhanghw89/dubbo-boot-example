package com.example.filter;

import java.util.UUID;

public class TraceContext {

    private static final ThreadLocal<String> traceId = new ThreadLocal<>();

    public static String getTraceId() {
        String id = traceId.get();
        if (id == null) {
            id = UUID.randomUUID().toString();
        }
        return id;
    }
}
