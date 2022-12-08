package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author susu
 * @email a951666991@gmail.com
 * @date 2022-11-28 15:30:17
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
