package com.duhong.springbootmybatis.dao;

import com.duhong.springbootmybatis.domin.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {
    @Select("select * from account where id=#{id}")
    public User getById(Integer id);
}
