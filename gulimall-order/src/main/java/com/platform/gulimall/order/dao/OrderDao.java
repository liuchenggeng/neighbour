package com.platform.gulimall.order.dao;

import com.platform.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-07-17 23:20:51
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
