package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ author Mr.Gu
 * @ (￣＾￣)
 * @ date: 2026/1/12
 * @ time: 23:45
 * @ description:
 */
@Mapper
public interface DishFlavorMapper {
    /*
    * 批量插入口味数据
    * */
    void insertBatch(List<DishFlavor> flavors);
}
