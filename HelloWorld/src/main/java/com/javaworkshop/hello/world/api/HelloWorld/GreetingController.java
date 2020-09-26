package com.javaworkshop.hello.world.api.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


//annotation says this is part of rest api, controller
@RestController
public class GreetingController {


    //this is a get action and it lives at /hello
    @GetMapping("/hello")
    public String sayHelloWorld() {
        return "Hello World";
    }

    @GetMapping("/greeting/{name}")
    public Greeting getGreeting(@PathVariable String name) {
        Greeting rv = new Greeting();
        rv.setMessage("Hello, " + name);
        return rv;
    }
}
