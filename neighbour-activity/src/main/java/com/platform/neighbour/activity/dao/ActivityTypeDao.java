package com.platform.neighbour.activity.dao;

import com.platform.neighbour.activity.entity.ActivityTypeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 活动类型表
 * 
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 17:28:21
 */
@Mapper
public interface ActivityTypeDao extends BaseMapper<ActivityTypeEntity> {
	
}
