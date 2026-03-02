cd /home/gestor/apache/services/cassandra/scripts
rm -rf /home/gestor/apache/Services/cassandra/data/data/system/*
rm -f /home/gestor/apache/services/cassandra/config/cassandra-topology.properties
/home/gestor/apache/services/cassandra/bin/Conf cassandra -Dcassandra.config=file:////home/gestor/apache/services/cassandra/config/cassandraPollutionCassandra.yaml

sleep 60

