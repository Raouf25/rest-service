package com.raouf.backend.api;

//import com.vitodoc.backend.AbstractVitodocTest;
//import com.vitodoc.backend.VitodocConfigurationTest;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
        import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

/**
 * See <a href=
 * "http://docs.spring.io/spring-framework/docs/current/spring-framework-reference/html/integration-testing.html#spring-mvc-test-server">Spring
 * ServerSide test</a> for HowTO manipulate Spring Fwk
 * <p>
 * <p>
 * Tutorial :
 * https://spring.io/guides/tutorials/bookmarks/#_testing_a_rest_service
 *
 * @author Abderraouf MAKHLOUF
 */
@RunWith(SpringRunner.class)
@EnableSpringDataWebSupport
//@ActiveProfiles("test")
public abstract class AbstractRaoufApiTest {

    @Autowired(required = false)
    protected MockMvc mockMvc;

    @Autowired
    protected ObjectMapper jsonMapper;
}
