package com.kfc.demo.endpoint.rest.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/hello")
  public Map<String, String> sayHello() {
    return Map.of("message", "hello world");
  }
}
