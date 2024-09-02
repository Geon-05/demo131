package com.example.demo131.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo131.dto.MemberDto;
import com.example.demo131.dto.SearchDto;

@Mapper
public interface MemberMapper {
  public List<MemberDto> selectMemberList(SearchDto searchDto);
  
  public int selectTotalCnt(SearchDto searchDto);
}
