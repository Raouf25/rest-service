package com.raouf.backend.common.filter;

import org.springframework.http.HttpHeaders;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ApiOriginFilter implements javax.servlet.Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        HttpServletResponse res = (HttpServletResponse) response;
        res.setHeader(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*");
        res.setHeader(HttpHeaders.ACCESS_CONTROL_ALLOW_METHODS, "GET, POST, DELETE, PUT, PATCH, OPTIONS");
        res.addHeader(HttpHeaders.ACCESS_CONTROL_ALLOW_HEADERS, String.format("%s, %s", HttpHeaders.CONTENT_TYPE, HttpHeaders.AUTHORIZATION));
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }
}
