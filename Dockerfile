FROM jboss/wildfly
ADD ./target/shifty-0.0.2-SNAPSHOT.war /opt/jboss/wildfly/standalone/deployments/
