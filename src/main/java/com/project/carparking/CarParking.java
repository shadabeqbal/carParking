package com.project.carparking;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@SpringBootApplication
@EnableAsync
@EnableScheduling
@EnableSwagger2
@EnableTransactionManagement
public class CarParking {
    private static final Logger logger = LogManager.getLogger(CarParking.class);

    public static void main(String[] args) {
        SpringApplication.run(CarParking.class, args);
    }

    @Bean
    public Docket productApi(){
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.project.one.controllers"))
                .paths(PathSelectors.regex("/*.*")).build().apiInfo(apiInfo());
    }

    private ApiInfo apiInfo(){
        return new ApiInfo("one",
                "A Basic Starter Project as a base package",
                "API-V1",
                "To be Used for any project",
                new Contact("Shadab Eqbal","","shadabeqbal2008@gmail.com"),
                "License of API",
                "", Collections.emptyList());
    }

}
