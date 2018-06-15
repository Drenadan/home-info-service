package com.msamsonov.homeinfoservice.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerContext {

    @Bean
    public Docket adminApi() {
        return api("admin", "com.msamsonov.homeinfoservice.api");
    }


    private Docket api(String groupName, String basePackage) {
        return new Docket(DocumentationType.SWAGGER_2)
            .groupName(groupName)
            .select()
            .apis(RequestHandlerSelectors.basePackage(basePackage))
            .build();
    }
}