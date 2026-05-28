package com.sky.service;

import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;
import org.springframework.stereotype.Service;

/**
 * @ author Mr.Gu
 * @ (￣＾￣)
 * @ date: 2026/1/17
 * @ time: 23:58
 * @ description:
 */
public interface UserService {
    /*
    * 微信登录
    * */
    User wxLogin(UserLoginDTO userLoginDTO);
}
