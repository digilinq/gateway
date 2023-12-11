# API GATEWAY

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