package com.luban.dao;

import org.apache.ibatis.annotations.Select;

public interface OrderMapper {

  @Select("select 'test'")
  String selectById();

}
