package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ author Mr.Gu
 * @ (￣＾￣)
 * @ date: 2026/1/13
 * @ time: 17:46
 * @ description:
 */
@Mapper
public interface SetmealDishMapper {
    /*
    * 根据菜品id查询对应套餐id
    * */
    //select setmeal_id from setmeal dish where dish_id in (1, 2, 3, 4)

    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);

    /*
    * 批量保存套餐和菜品关联关系
    * */
    void insertBatch(List<SetmealDish> setmealDishes);
}
