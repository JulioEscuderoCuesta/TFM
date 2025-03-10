#!/bin/bash
cd /home/gestor/apache/services/kafka/scripts

TOPIC_NAME="Pollution"

/home/gestor/apache/services/kafka/bin/kafka-topics.sh --list --bootstrap-server 172.31.16.47:2018 | grep Pollution

#Si existe el topico
if [ $? -eq 0 ]; then
    exit 0
fi

#Si no existe el topico se crea
/home/gestor/apache/services/kafka/bin/kafka-topics.sh --create --bootstrap-server 172.31.16.47:2018 \
    --replication-factor 1 \
    --partitions 1 \
    --topic Pollution
