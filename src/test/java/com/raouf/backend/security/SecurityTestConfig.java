package com.raouf.backend.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


/**
 * Use this configuration class to test if your path is secured
 * This class use {@link SecurityConfig.CommonSecurityAdapter} which define all
 * security matchers
 */
public class SecurityTestConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.apply(new SecurityConfig.CommonSecurityAdapter());
    }
}
