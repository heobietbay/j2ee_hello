package com.example.j2ee_hello.managedbeans;

import javax.inject.Named;

@Named
public class HelloJsfBean {
    public String getMessage() {
        return "Hello JSF!";
    }
}
