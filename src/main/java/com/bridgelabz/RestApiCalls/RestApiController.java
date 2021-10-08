package com.bridgelabz.RestApiCalls;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

    //http://localhost:8080/hello
    @GetMapping(value = "/hello")
    public String simple(){
        return "Hello From BridgeLabz";
    }
}
