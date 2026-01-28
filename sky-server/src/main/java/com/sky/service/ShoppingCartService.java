package com.sky.service;

import com.sky.dto.ShoppingCartDTO;
import com.sky.entity.ShoppingCart;

import java.util.List;

/**
 * @ author Mr.Gu
 * @ (￣＾￣)
 * @ date: 2026/1/27
 * @ time: 18:11
 * @ description:
 */
public interface ShoppingCartService {
    /*
    * 添加购物车
    * */
    void addShoppingCart(ShoppingCartDTO shoppingCartDTO);

    /*
    * 查看购物车
    * */
    List<ShoppingCart> showShoppingCart();

    /*
    * 清空购物车
    * */
    void cleanShoppingCart();
}
