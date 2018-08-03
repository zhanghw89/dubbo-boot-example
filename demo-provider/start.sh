#!/usr/bin/env bash

#JAVA_OPTIONS = -Dcsp.sentinel.dashboard.server=consoleIp:port
java -Dcsp.sentinel.dashboard.server=localhost:8080 -jar ./target/demo-provider-1.0.0-SNAPSHOT.jar