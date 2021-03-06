package com.elearn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerUi {

    @Bean
    public OpenAPI openApiConfig() {
        return new OpenAPI().info(new Info().title("Legendary Cricketers").description("This is the description")
                .version("1.0.0").license(new License().name("Toufiq Mulla")));
    }
}
