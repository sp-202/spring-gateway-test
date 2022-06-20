package com.example.resource_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceApi {

    @GetMapping("/resource/body/hello")
    public String resourceBody(){
        return "I am from resource controller";
    }
}
