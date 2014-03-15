# Test environment
* Eclipse Java IDE for Web Developers Kepler Service Release1

# Requirement(Eclipse Plugin)
* JBoss by Redhat 3.5.0 Final
* Gradle IDE 3.4.0

# Import as Eclipse Project
1. File -> Import
1. Gradle Project ->Next
1. Root folder /path/to/minutes" -> Build Model
1. Select Project "minutes" -> Finish


# Setting Jboss EAP 6.1
## configure jdbc driver as custom module.
on cli.
1. ```module add --name=com.oracle --resources=e:\usr\temp\com\oracle\ojdbc6.jar --dependencies=javax.api,javax.transaction.api```
   created directory "${JBOSS_HOME}/modules/com/oracle/main" and some module setting files.
1. cd /subsystem=datasources
1. ./jdbc-driver=oracle-driver:add(driver-name=oracle-driver,driver-module-name=com.oracle)
1. jdbc-driver-info
   for confirmation jdbc-driver registered.
## configure datasource.
1. data-source add --name=MinutesDS --connection-url="jdbc:oracle:thin@192.168.211.176:1521:xe" --driver-name=oracle-driver --jndi-name=java:jboss/resources/jdbc/MinutesDS
   configured standalne/configuration/ostandalone.xml
   
1. data-source --name=MinutesDS --user-name=minutes --password=minutes --jta=true
1. data-source read-resource --name=MintuesDS --recursive=true
1. data-source enable --name=MinutesDS