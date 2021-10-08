package com.bridgelabz.RestApiCalls;

import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "/hello/post")
    public String getBodyMessage(@RequestBody User user){
        return "Hello "+user.getFname()+" "+user.getLname()+" from bridgelabz";
    }
}
