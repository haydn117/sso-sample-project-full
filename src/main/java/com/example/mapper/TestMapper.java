package com.example.mapper;

import org.apache.ibatis.annotations.Select;

public interface TestMapper {
    @Select("SELECT NOW()")
    String getCurrentTime();
}
