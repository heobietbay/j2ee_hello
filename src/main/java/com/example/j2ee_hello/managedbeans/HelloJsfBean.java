package com.example.j2ee_hello.managedbeans;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloJsfBean {
    public String getMessage() {
        return "Hello JSF!";
    }
}
