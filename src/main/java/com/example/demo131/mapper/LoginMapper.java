package com.example.demo131.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo131.dto.MemberDto;

@Mapper
public interface LoginMapper {
  public MemberDto login(MemberDto member);
}
