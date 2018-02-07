package com.raouf.backend;

import com.google.common.base.Predicates;
import com.raouf.backend.common.filter.ApiOriginFilter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Pageable;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.Filter;
import java.util.concurrent.Executor;

@Configuration
@EnableSwagger2
@EnableAutoConfiguration
@EnableScheduling
@EnableAsync
@ComponentScan(basePackages = "com.raouf.backend")
public class RaoufBackendConfiguration {


    @Configuration
    @NoArgsConstructor
    @Getter
    @Setter
    class SwaggerConfiguration {
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
                    .paths(Predicates.not(PathSelectors.regex("/error")))
                    .build();
        }
    }

    @Bean
    public Filter originFilter() {
        return new ApiOriginFilter();
    }

    /**
     * Limit the number of concurrent threads to 200 and limit the size of the queue to 1000
     * see : https://spring.io/guides/gs/async-method/
     */
    @Bean
    public Executor asyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(200);
        executor.setMaxPoolSize(200);
        executor.setQueueCapacity(1000);
        executor.initialize();
        return executor;
    }
}
