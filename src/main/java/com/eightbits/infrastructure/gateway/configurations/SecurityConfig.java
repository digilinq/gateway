package com.eightbits.infrastructure.gateway.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityWebFilterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests(requestMatcherRegistry ->
                        requestMatcherRegistry.requestMatchers("/login", "/signup").permitAll()
                                .anyRequest().authenticated())
                .formLogin(loginConfigurer -> loginConfigurer.loginPage("/login").permitAll())
                .logout(LogoutConfigurer::permitAll)
                .csrf(AbstractHttpConfigurer::disable);
        return http.build();
    }
}
