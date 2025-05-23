package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author limin
 * @email sunlightcs@gmail.com
 * @date 2025-05-23 13:00:40
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
