package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
@Controller

@EnableAutoConfiguration

public class HelloController {

    @Value("${DB_URL:default_url}")
    private String myDB;

    @Value("${DB_USER:default_user}")
    private String myUser;

    @Value("${HOSTNAME:default_hostname}")
    private String myHostname;

    @RequestMapping("/hello")

    @ResponseBody

    public String sayHello() {

        return "Hello ,this is version 3 of springboot sample app,with variables"+myDB+" " +
                myUser+" running on "+myHostname;

    }

}