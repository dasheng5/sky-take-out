package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @ author Mr.Gu
 * @ (￣＾￣)
 * @ date: 2026/1/18
 * @ time: 0:40
 * @ description:
 */
@Mapper
public interface UserMapper {
    /*
    * 根据openid查询用户
    * */
    @Select("select * from user where openid = #{openid}")
    User getByOpenid(String userid);

    /*
    * 插入数据
    * */
    void insert(User user);
}
