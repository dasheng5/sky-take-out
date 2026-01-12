package com.sky.service;

import com.sky.dto.DishDTO;

/**
 * @ author Mr.Gu
 * @ (￣＾￣)
 * @ date: 2026/1/12
 * @ time: 22:50
 * @ description:
 */

public interface DishService {

    /*
    * 新增菜品和对应口味
    * */
    public void saveWithFlavor(DishDTO dishDTO);
}
