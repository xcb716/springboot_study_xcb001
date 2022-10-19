package com.example.springboot001.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot001.entity.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookDao extends BaseMapper<Book> {
}
