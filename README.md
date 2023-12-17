# API GATEWAY

[Spring Cloud Gateway](https://cloud.spring.io/spring-cloud-static/spring-cloud-gateway/2.1.0.RC2/single/spring-cloud-gateway.html)

## Development

### ToolChain

### Run 
```shell
mvn spring-boot:run -Dspring-boot.run.profiles=local
```

### Integration Tests
```shell
mvn -DskipTests=true verify
```

## Production

### Spring Cloud Config Connectivity
[Spring Cloud Config Client](https://stackoverflow.com/questions/67507452/no-spring-config-import-property-has-been-defined)

### Spring Cloud Gateway Monitoring
[Spring Cloud Gateway Reactive Server - Actuator API](https://docs.spring.io/spring-cloud-gateway/reference/spring-cloud-gateway/actuator-api.html)