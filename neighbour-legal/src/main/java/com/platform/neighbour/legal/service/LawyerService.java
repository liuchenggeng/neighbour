package com.platform.neighbour.legal.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.platform.common.utils.PageUtils;
import com.platform.neighbour.legal.entity.LawyerEntity;

import java.util.Map;

/**
 * 律师信息表
 *
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 22:14:04
 */
public interface LawyerService extends IService<LawyerEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

