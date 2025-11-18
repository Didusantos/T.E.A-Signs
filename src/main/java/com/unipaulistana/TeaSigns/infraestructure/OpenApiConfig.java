package com.unipaulistana.TeaSigns.infraestructure;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;

public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Api de exemplo: Blog")
                        .version("1.0")
                        .description("Uma API para gerenciamento do TCA signs")
                );
    }
}
