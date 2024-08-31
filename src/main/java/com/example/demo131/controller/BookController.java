package com.example.demo131.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo131.dto.BookDto;
import com.example.demo131.dto.SearchDto;
import com.example.demo131.service.BookService;

import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j
public class BookController {
  @Autowired
  BookService service;

  @GetMapping("/book/bookList")
  public String bookList(
    SearchDto searchDto
    , Model model
  ) {
    Map<String, Object> map = service.selectBookList(searchDto);
    model.addAttribute("map", map);
    
      return "/book/list";
  }
  
}
