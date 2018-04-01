package com.raouf.backend.config;

import com.raouf.backend.api.CitiesApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Pageable;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * Documenting Spring Rest APIs using Swagger
 * see : https://www.callicoder.com/documenting-spring-rest-apis-using-swagger/#configuration-for-non-spring-boot-projects
 */


@Configuration
@EnableSwagger2
public class SwaggerConfig {

    ApiInfo apiInfo() {

        return new ApiInfoBuilder()
                .title("Raouf API Specifications")
                .version("1.0.0")
                .contact(new Contact("Raouf MAKHLOUF", null, "makhlouf.raouf@gmail.com"))
                .build();
    }

    @Bean
    public Docket defaultDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .useDefaultResponseMessages(false)
                .apiInfo(apiInfo())
                .ignoredParameterTypes(Pageable.class)
                .select()
                .apis(RequestHandlerSelectors.basePackage(CitiesApi.class.getPackage().getName()))
                .build();
    }

}
