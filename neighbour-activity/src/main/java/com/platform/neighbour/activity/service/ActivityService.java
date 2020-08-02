package com.platform.neighbour.activity.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.platform.neighbour.common.utils.PageUtils;
import com.platform.neighbour.activity.entity.ActivityEntity;

import java.util.Map;

/**
 * 活动信息表
 *
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 17:28:21
 */
public interface ActivityService extends IService<ActivityEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

