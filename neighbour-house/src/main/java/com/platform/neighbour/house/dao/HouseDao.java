package com.platform.neighbour.house.dao;

import com.platform.neighbour.house.entity.HouseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 小区信息表
 * 
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 17:38:41
 */
@Mapper
public interface HouseDao extends BaseMapper<HouseEntity> {
	
}
