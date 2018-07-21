# WAR container plugins

## Config container

See pom.xml
```
<scan.interval.seconds>0</scan.interval.seconds>
<context.path>/</context.path>
<port>8080</port>
```

## Run

### Tomcat

mvn tomcat7:run

### Jetty

mvn jetty:run