package com.platform.neighbour.member.dao;

import com.platform.neighbour.member.entity.UserDetailInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 实名认证表
 * 
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 17:35:40
 */
@Mapper
public interface UserDetailInfoDao extends BaseMapper<UserDetailInfoEntity> {
	
}
