cd /home/gestor/apache/services/kafka/scripts
rm -f /home/gestor/apache/services/kafka/logs/meta.properties
/home/gestor/apache/services/kafka/bin/kafka-Service-start.sh -daemon /home/gestor/apache/services/kafka/config/kafka1.properties
