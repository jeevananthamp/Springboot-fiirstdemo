package com.stackroute.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    @GetMapping("/")
    public  String sayhello()
    {
        return  "hello jeeva ,now the time is"+ LocalDateTime.now();
    }


}
