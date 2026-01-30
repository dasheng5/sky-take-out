package com.sky.mapper;

import com.sky.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ author Mr.Gu
 * @ (￣＾￣)
 * @ date: 2026/1/30
 * @ time: 20:08
 * @ description:
 */
@Mapper
public interface OrderMapper {
    /*
    * 插入订单数据
    * */
    void insert(Orders orders);
}
