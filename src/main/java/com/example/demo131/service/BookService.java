package com.example.demo131.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo131.dto.BookDto;
import com.example.demo131.dto.PageDto;
import com.example.demo131.dto.SearchDto;
import com.example.demo131.mapper.BookMapper;

@Service
public class BookService {
  @Autowired
  BookMapper mapper;

  public Map<String, Object> selectBookList(SearchDto searchDto) {
    Map<String, Object> map = new HashMap<>();

    List<BookDto> list = mapper.selectBookList(searchDto);

    int totalCnt = mapper.selectTotalCnt(searchDto);

    PageDto pageDto = new PageDto(searchDto, totalCnt);
    map.put("list", list);
    map.put("pageDto", pageDto);

    return map;
  }
  
  public int insertBook(BookDto book){
    return mapper.insertBook(book);
  }
}
