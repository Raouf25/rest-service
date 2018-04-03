package com.raouf.backend.security;

import com.raouf.backend.common.RaoufApiEndpoints;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.InMemoryUserDetailsManagerConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;

/**
 * @see <a href="http://www.keycloak.org/docs/latest/securing_apps/topics/oidc/java/spring-security-adapter.html">Keycloak doc</a>
 * Inspired by <a href="https://developers.redhat.com/blog/2017/05/25/easily-secure-your-spring-boot-applications-with-keycloak/">This article</a>
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    public static final String SWAGGER_ROLE = "SWAGGER";


    @Configuration
    @Order(1)
    public static class MonitoringSecurityConfigurationAdapter extends WebSecurityConfigurerAdapter {

        @Value("${security.swagger.user.login}")
        private String swaggerUserLogin;

        @Value("${security.swagger.user.pwd}")
        private String swaggerUserPwd;

        private InMemoryUserDetailsManagerConfigurer<AuthenticationManagerBuilder>
        inMemoryConfigurer() {
            return new InMemoryUserDetailsManagerConfigurer<>();
        }

        @Autowired
        public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
            inMemoryConfigurer().withUser(swaggerUserLogin).password(swaggerUserPwd).roles(SWAGGER_ROLE)
                                .and()
                                .configure(auth);
        }

        protected void configure(HttpSecurity http) throws Exception {
            http
                    .csrf().disable()
                    .sessionManagement()
                    .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                    .and()
                    .requestMatchers()
                    .antMatchers(RaoufApiEndpoints.ROOT,
                                 RaoufApiEndpoints.SWAGGER_UI,
                                 RaoufApiEndpoints.SWAGGER,
                                 RaoufApiEndpoints.SWAGGER_RESOURCES,
                                 RaoufApiEndpoints.SWAGGER_API_DOCS,
                                 RaoufApiEndpoints.SWAGGER_WEBJARS)
                    .and()
                    .authorizeRequests()
                    .antMatchers(RaoufApiEndpoints.SWAGGER_RESOURCES).permitAll()
                    .antMatchers(RaoufApiEndpoints.ROOT,
                                 RaoufApiEndpoints.SWAGGER_UI,
                                 RaoufApiEndpoints.SWAGGER,
                                 RaoufApiEndpoints.SWAGGER_WEBJARS,
                                 RaoufApiEndpoints.SWAGGER_API_DOCS).hasRole(SWAGGER_ROLE)
                    .and()
                    .httpBasic();
        }
    }


    @Configuration
    @Order(2)
    public static class RaoufConfigurationAdapter extends WebSecurityConfigurerAdapter {
        /**
         * Registers the Provider with the authentication manager.
         */
        @Autowired
        public void configureGlobal(AuthenticationManagerBuilder auth) {
        }

        /**
         * Specific Configuration (add filtres, etc)
         *
         * @param http
         * @throws Exception
         */
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http
                    // on applique la configuration commune (test et run)
                    .apply(new CommonSecurityAdapter());
        }

    }
        /**
         * See https://docs.spring.io/spring-security/site/docs/current/reference/htmlsingle/#jc-custom-dsls
         * <p>  * Manage paths securisation here !You must use this configuration in tests to validate routes securisation</p>
         * <p>Use with                 .and().apply(new CommonVitodocSecuritAdapter()) on http dsl</p>
         */
        public static class CommonSecurityAdapter extends AbstractHttpConfigurer<CommonSecurityAdapter, HttpSecurity> {

            @Override
            public void init(HttpSecurity http) throws Exception {
                // any method that adds another configurer
                // must be done in the init method
                http
                        // disable csrf because of API mode
                        .csrf().disable()
                        .sessionManagement()
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                        .and()
                        // manage routes securisation here
                        .authorizeRequests()

                        .antMatchers(RaoufApiEndpoints.CITIES_SEARCH).permitAll()

                        .anyRequest().denyAll()
                ;
            }
        }

}