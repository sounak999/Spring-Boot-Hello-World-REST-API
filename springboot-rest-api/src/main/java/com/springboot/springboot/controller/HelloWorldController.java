package com.springboot.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
// make Java class as a Spring MVC controller
//@ResponseBody
// object serialized into JSON and passed back into the HttpResponse object
@RestController
public class HelloWorldController {

    // HTTP GET Request
    // http://localhost:8080/hello-world

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }
}
