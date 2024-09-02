package com.example.demo131.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.demo131.dto.SearchDto;
import com.example.demo131.service.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MemberController {
  @Autowired
  MemberService service;

  @GetMapping("/member/memberList")
  public String memberList(SearchDto searchDto, Model model) {
    Map<String, Object> map = service.selectMemberList(searchDto);
    model.addAttribute("map", map);
      return "/member/list";
  }
  
  @GetMapping("/member/memberDetail")
  public String memberDetail() {
      return "/member/detail";
  }
  
}
