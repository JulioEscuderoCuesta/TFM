cd /home/gestor/apache/services/cassandra/scripts
rm -rf /home/gestor/apache/Services/cassandra/data/data/system/*
rm -f /home/gestor/apache/services/cassandra/config/cassandra-topology.properties
/home/gestor/apache/services/cassandra/bin/Conf_Cassandra -Dcassandra.config=file:////home/gestor/apache/services/cassandra/config/cassandraPollutionCassandra.yaml

sleep 60

/home/gestor/apache/services/cassandra/bin/cqlsh 127.0.0.1 -f /home/gestor/apache/services/cassandra/scripts/cassandra_schema.sql
