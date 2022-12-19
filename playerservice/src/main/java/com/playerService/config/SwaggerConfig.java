package com.playerService.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


import java.util.ArrayList;

@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api(){

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(
                        new ApiInfo(
                                "GAME: ROCK, PAPER and SCISSORS",
                                "RESTful APIs",
                                "0.0.1",
                                null,
                                new Contact(
                                        "Prabhanshu Gupta",
                                        null,
                                        "Prabhanshu1808@gmail.com"),
                                null,
                                null,
                                new ArrayList<>()))
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();

    }


}
