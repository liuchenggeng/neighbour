package com.platform.gulimall.member.dao;

import com.platform.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-07-17 22:59:19
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}