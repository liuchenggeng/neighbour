package com.platform.neighbour.legal.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.platform.common.utils.PageUtils;
import com.platform.neighbour.legal.entity.LegalConsulteEntity;

import java.util.Map;

/**
 * 法律咨询信息表
 *
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 22:14:04
 */
public interface LegalConsulteService extends IService<LegalConsulteEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

