package com.aloha.kiosk.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Cup Ramen Kiosk API")
                        .description("API documentation for the Cup Ramen Kiosk")
                        .version("1.0.0"));
    }
}