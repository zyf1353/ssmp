package com.zyf.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zyf.domain.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookDao extends BaseMapper<Book> {

//    @Select("select * from tb_book where id = #{id}")
//    Book getById(Integer id);
}
