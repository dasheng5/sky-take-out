package com.sky.service;

import com.sky.dto.SetmealDTO;

/**
 * @ author Mr.Gu
 * @ (￣＾￣)
 * @ date: 2026/1/25
 * @ time: 15:59
 * @ description:
 */
public interface SetmealService {
    /**
     * 新增套餐，同时需要保存套餐和菜品的关联关系
     * @param setmealDTO
     */
    void saveWithDish(SetmealDTO setmealDTO);
}
