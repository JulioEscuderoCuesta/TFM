cd /home/gestor/apache/apps/services/cassandra/scripts
rm -rf /home/gestor/apache/Services/cassandra/data/data/system/*
rm -f /home/gestor/apache/apps/services/cassandra/config/cassandra-topology.properties
/home/gestor/apache/apps/services/cassandra/bin/Conf cassandra -Dcassandra.config=file:////home/gestor/apache/apps/services/cassandra/config/cassandraPollutionCassandra.yaml

sleep 60

/home/gestor/apache/apps/services/cassandra/bin/cqlsh 172.31.16.51 -f /home/gestor/apache/apps/services/cassandra/scripts/cassandra_schema
