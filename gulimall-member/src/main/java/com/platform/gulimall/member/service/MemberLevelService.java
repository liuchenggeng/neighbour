package com.platform.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.platform.common.utils.PageUtils;
import com.platform.gulimall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-07-17 22:59:18
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

