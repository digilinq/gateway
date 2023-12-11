package com.eightbits.infrastructure.gateway;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("test")
@SpringBootApplication
class ApiGatewayApplicationTest {

    @Test
    void contextLoads() {
    }
}