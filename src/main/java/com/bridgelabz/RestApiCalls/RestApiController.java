package com.bridgelabz.RestApiCalls;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

    //http://localhost:8080/hello
    @GetMapping(value = "/hello")
    public String getMessage(){
        return "Hello From BridgeLabz";
    }

    //http://localhost:8080/hello/query?name=Mark
    @GetMapping(value = "/hello/query")
    public String getQueryMessage(@RequestParam String name){
        return "Hello "+name+" from Bridgelabz";
    }

    //http://localhost:8080/hello/param/Mark
    @GetMapping(value = "/hello/param/{name}")
    public String getPathMessage(@PathVariable String name){
        return "Hello "+name+" from Bridgelabz";
    }
}
