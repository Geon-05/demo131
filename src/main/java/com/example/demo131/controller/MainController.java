package com.example.demo131.controller;

import org.springframework.stereotype.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@Slf4j
public class MainController {
  @GetMapping("/")
  public String index() {
      return "/index";
  }
  
}
