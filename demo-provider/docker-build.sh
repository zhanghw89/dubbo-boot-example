#!/usr/bin/env bash
#只执行 build 操作
mvn clean package docker:build

#执行 build 完成后 push 镜像
#mvn clean package docker:build -DpushImage

#执行 build 并 push 指定 tag 的镜像
#mvn clean package docker:build -DpushImageTag