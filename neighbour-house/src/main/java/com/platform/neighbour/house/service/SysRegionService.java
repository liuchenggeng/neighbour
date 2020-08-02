package com.platform.neighbour.house.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.platform.common.utils.PageUtils;
import com.platform.neighbour.house.entity.SysRegionEntity;

import java.util.Map;

/**
 * 全国区域表
 *
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 17:38:41
 */
public interface SysRegionService extends IService<SysRegionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

