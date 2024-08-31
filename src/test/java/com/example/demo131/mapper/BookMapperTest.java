package com.example.demo131.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo131.dto.BookDto;

@SpringBootTest
public class BookMapperTest {
  @Autowired
  BookMapper mapper;

  // @Test
  // void testSelectBookList() {
  //   List<BookDto> list = mapper.selectBookList();
  //   assertEquals(19, list.size());
  // }
}
