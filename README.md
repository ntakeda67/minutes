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
1. created directory "${JBOSS_HOME}/modules/com/oracle/main" and some module setting files.
   ```module add --name=com.oracle --resources=e:\usr\temp\com\oracle\ojdbc6.jar --dependencies=javax.api,javax.transaction.api```
1. set datasource configure mode.
   ```cd /subsystem=datasources```
1. add jdbc driver module.
   ```./jdbc-driver=oracle-driver:add(driver-name=oracle-driver,driver-module-name=com.oracle)```
1. confirm registered jdbc-driver.
   ```jdbc-driver-info```
## configure datasource.
1. configured standalne/configuration/standalone.xml
   ```data-source add --name=MinutesDS --connection-url="jdbc:oracle:thin@192.168.211.176:1521:xe" --driver-name=oracle-driver --jndi-name=java:jboss/resources/jdbc/MinutesDS```
   
1. configured other setttings.
   ```data-source --name=MinutesDS --user-name=minutes --password=minutes --jta=true```
1. confirm data source information.
   ```data-source read-resource --name=MintuesDS --recursive=true```
1. enabled data source
   ```data-source enable --name=MinutesDS```