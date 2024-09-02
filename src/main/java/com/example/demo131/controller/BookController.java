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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



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

  @GetMapping("/book/bookInsert")
  public String bookInsert() {
      return "/book/insert";
  }
  
  @PostMapping("/book/bookInsertAction")
  public String bookInsert(
    BookDto book
    , Model model
  ) {
      int res = service.insertBook(book);

      if (res > 0) {
        model.addAttribute("msg", "도서등록이 완료되었습니다.");
        model.addAttribute("url", "/book/bookInsert");
        return "/common/msg";
      } else {
        model.addAttribute("msg", "입력중 예외가 발생했습니다.");
        return "/common/msg";
      }
  }
  
  @GetMapping("/book/bookDetail")
  public String bookDetail() {
      return "/book/detail";
  }
  
}
