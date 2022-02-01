package com.pie.trainingtask.customerapp.config;

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

//http://localhost:8081/v2/api-docs
//http://localhost:8081/swagger-ui.html
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    //provide the docket bean which is the main bean used for swagger configuration.
    @Bean
    public Docket provideApi() {

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.pie.trainingtask.customerapp.controller"))
                .paths(PathSelectors.any())
                .build();

        /*
        *@EnableSwagger2: enables the swagger
        *DocumentationType.SWAGGER_2: tells the Docket that we are using version 2
        *select(): creates a builder, which is used to define which controllers and which of their methods should be included in the generated documentation.
        *Apis(): define the classes to be included. Here we are including all of them, but you can limit them by a base package, class annotations and more. For example, to select only the classes that are marked with @RestController annotation, we could use something like:
         RequestHandlerSelectors.withClassAnnotation(RestController.class)
        *Paths(): allows you to define which controller’s methods should be included based on their path mappings.
        */
    }

    /*
    By default, the header part of our documentation is pretty generic
    but you can easily customize it using the ApiInfo object, which
    provides general information about the API such as title, version and etc.
    */
//    private ApiInfo apiInfo() {
//
//        return new ApiInfoBuilder()
//                .title("Test APIs")
//                .description("This page lists all the rest test apis.")
//                .version("1.0-SNAPSHOT")
//                .build();
//    }

    private ApiInfo getApiInfo() {
        return new ApiInfo(
                "My REST API",
                "Some custom description of API.",
                "API TOS",
                "Terms of service",
                new Contact("John Doe", "www.example.com", "myeaddress@company.com"),
                "License of API", "API license URL", Collections.emptyList());
    }
}
