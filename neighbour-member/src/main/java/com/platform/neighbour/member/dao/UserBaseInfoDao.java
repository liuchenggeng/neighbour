package com.platform.neighbour.member.dao;

import com.platform.neighbour.member.entity.UserBaseInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户基本信息表
 * 
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 17:35:40
 */
@Mapper
public interface UserBaseInfoDao extends BaseMapper<UserBaseInfoEntity> {
	
}
