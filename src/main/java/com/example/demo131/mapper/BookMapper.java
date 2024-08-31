package com.example.demo131.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo131.dto.BookDto;
import com.example.demo131.dto.SearchDto;

@Mapper
public interface BookMapper {

  public List<BookDto> selectBookList(SearchDto searchDto);

  public int selectTotalCnt(SearchDto searchDto);

  public int insertBook(BookDto book);
  
}
