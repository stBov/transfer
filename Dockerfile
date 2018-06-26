From hub.c.163.com/library/ubuntu:latest
MAINTAINER ssj
ADD jdk-8u73-linux-x64.tar.gz /usr/local
RUN mv /usr/local/jdk1.8.0_73 /usr/local/jdk1.8
ENV JAVA_HOME /usr/local/jdk1.8
ENV PATH $JAVA_HOME/bin:$PATH
ADD target/transfer-0.0.1-SNAPSHOT.jar /usr/local

