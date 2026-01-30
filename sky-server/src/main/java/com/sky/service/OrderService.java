package com.sky.service;

import com.sky.dto.OrdersSubmitDTO;
import com.sky.vo.OrderSubmitVO;

/**
 * @ author Mr.Gu
 * @ (￣＾￣)
 * @ date: 2026/1/30
 * @ time: 20:01
 * @ description:
 */
public interface OrderService {
    /*
     * 用户下单接口
     * */
    OrderSubmitVO submitOrder(OrdersSubmitDTO ordersSubmitDTO);
}
