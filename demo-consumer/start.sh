#!/usr/bin/env bash

#JAVA_OPTIONS = -Djava.net.preferIPv4Stack=true -Dcsp.sentinel.api.port=8720 -Dcsp.sentinel.dashboard.server=localhost:8080 -Dproject.name=dubbo-provider-demo
java -Dcsp.sentinel.dashboard.server=localhost:8080 -jar ./target/de