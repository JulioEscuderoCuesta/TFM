#!/bin/bash
cd /home/gestor/apache/Services/zookeeper/scripts

TOPIC_NAME="Pollution"

/home/gestor/apache/Services/zookeeper/bin/conf --list --bootstrap-server 127.0.0.1:9092 | grep Pollution

#Si existe el topico
if [ $? -eq 0 ]; then
    exit 0
fi

#Si no existe el topico se crea
/home/gestor/apache/Services/zookeeper/bin/conf --create --bootstrap-server 127.0.0.1:9092 \
    --replication-factor 1 \
    --partitions 1 \
    --topic Pollution
