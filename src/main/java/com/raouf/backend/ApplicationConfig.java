package com.raouf.backend;

import com.raouf.backend.config.SwaggerConfig;
import com.raouf.backend.common.filter.ApiOriginFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import javax.servlet.Filter;
import java.util.concurrent.Executor;

@Configuration
@ComponentScan(basePackages = "com.raouf.backend")
@Import(value = SwaggerConfig.class)
public class ApplicationConfig {


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
