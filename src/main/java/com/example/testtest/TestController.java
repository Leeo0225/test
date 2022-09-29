package com.example.testtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/get")
    public String test() {
        System.out.println("访问成功");
        return "访问成功!";
    }

}
