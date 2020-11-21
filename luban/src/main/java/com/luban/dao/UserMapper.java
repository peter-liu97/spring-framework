package com.luban.dao;

import com.luban.entity.Luban;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

  @Select("select 'test'")
  String selectById();

}
