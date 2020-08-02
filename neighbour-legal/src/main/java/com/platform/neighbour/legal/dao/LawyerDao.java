package com.platform.neighbour.legal.dao;

import com.platform.neighbour.legal.entity.LawyerEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 律师信息表
 * 
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 22:14:04
 */
@Mapper
public interface LawyerDao extends BaseMapper<LawyerEntity> {
	
}
