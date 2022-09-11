package com.PruebaTec.prueba.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.PruebaTec.prueba.controllers"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(miApiInfo());
    }

    private ApiInfo miApiInfo(){
        return new ApiInfo(
                 "API Prueba tecnica - Clientes",
                 "Api de pruebas de microservicios Java",
                "v1", "Terms of services",
                new Contact("Cristian Amado", "www.colmedica.com", "cristianjac@colmedica.com"),
                            "Licencia de la API","URL Licencia", Collections.emptyList());

    }
}
