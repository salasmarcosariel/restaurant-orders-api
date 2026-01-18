package com.example.restaurant_api.config;

import io.swagger.v3.oas.models.*;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {

        SecurityScheme securityScheme = new SecurityScheme()
                .name("Authorization")
                .type(SecurityScheme.Type.HTTP)
                .scheme("bearer")
                .bearerFormat("JWT");

        SecurityRequirement securityRequirement =
                new SecurityRequirement().addList("Authorization");

        return new OpenAPI()
                .info(new Info()
                        .title("Restaurant API")
                        .description("REST API for managing orders and products with JWT authentication")
                        .version("1.0.0"))
                .components(new Components()
                        .addSecuritySchemes("Authorization", securityScheme))
                .addSecurityItem(securityRequirement);
    }
}