package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.*;
/**
 * @ author Mr.Gu
 * @ (￣＾￣)
 * @ date: 2026/1/12
 * @ time: 0:00
 * @ description:自动填充标识注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoFill {
    //数据库操作类型: UPDATE INSERT
    OperationType value();
}
