package com.example.j2ee_hello.filter;

import com.example.j2ee_hello.service.LogService;
import com.example.j2ee_hello.service.LogServiceImpl;

import javax.inject.Inject;
import javax.servlet.*;
import java.io.IOException;

public class LogRequestFilter implements Filter {

    @Inject
    private LogService logService;
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        logService.logRequest(request);
        chain.doFilter(request, response);
    }
}
