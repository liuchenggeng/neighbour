package com.platform.neighbour.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.platform.common.utils.PageUtils;
import com.platform.neighbour.member.entity.UserBaseInfoEntity;

import java.util.Map;

/**
 * 用户基本信息表
 *
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 17:35:40
 */
public interface UserBaseInfoService extends IService<UserBaseInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

