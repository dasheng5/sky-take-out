package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

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

    /**
     * 根据套餐id查询套餐和菜品的关联关系
     * @param setmealId
     * @return
     */
    @Select("select * from setmeal_dish where setmeal_id = #{setmealId}")
    List<SetmealDish> getBySetmealId(Long setmealId);

    /*
    * 删除套餐和菜品的关联关系
    * */
    @Delete("delete from setmeal_dish where setmeal_id = #{setmealId}")
    void deleteBySetmealId(Long setmealId);
}
