package com.sky.mapper;

import com.sky.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ author Mr.Gu
 * @ (￣＾￣)
 * @ date: 2026/1/30
 * @ time: 20:09
 * @ description:
 */
@Mapper
public interface OrderDetailMapper {
    /*
    * 批量插入订单明细数据
    * */
    void insertBatch(List<OrderDetail> orderDetailList);
}
