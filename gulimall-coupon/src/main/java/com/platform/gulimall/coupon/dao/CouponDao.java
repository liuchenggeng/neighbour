package com.platform.gulimall.coupon.dao;

import com.platform.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-07-17 23:07:00
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
