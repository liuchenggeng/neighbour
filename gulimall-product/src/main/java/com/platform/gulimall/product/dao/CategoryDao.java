package com.platform.gulimall.product.dao;

import com.platform.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-07-17 23:23:51
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
