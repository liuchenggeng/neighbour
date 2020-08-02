package com.platform.neighbour.activity.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.platform.neighbour.common.utils.PageUtils;
import com.platform.neighbour.activity.entity.ActivityMemberEntity;

import java.util.Map;

/**
 * 活动参与人信息表
 *
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 17:28:21
 */
public interface ActivityMemberService extends IService<ActivityMemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

