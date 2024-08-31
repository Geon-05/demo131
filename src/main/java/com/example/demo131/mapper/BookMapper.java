package com.example.demo131.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo131.dto.BookDto;
import com.example.demo131.dto.SearchDto;

@Mapper
public interface BookMapper {

  List<BookDto> selectBookList(SearchDto searchDto);

  int selectTotalCnt(SearchDto searchDto);
  
}
