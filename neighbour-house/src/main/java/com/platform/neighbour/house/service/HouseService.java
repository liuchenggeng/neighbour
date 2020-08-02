package com.platform.neighbour.house.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.platform.common.utils.PageUtils;
import com.platform.neighbour.house.entity.HouseEntity;

import java.util.Map;

/**
 * 小区信息表
 *
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 17:38:41
 */
public interface HouseService extends IService<HouseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

