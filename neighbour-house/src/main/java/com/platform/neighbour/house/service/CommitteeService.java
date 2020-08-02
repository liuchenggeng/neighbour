package com.platform.neighbour.house.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.platform.common.utils.PageUtils;
import com.platform.neighbour.house.entity.CommitteeEntity;

import java.util.Map;

/**
 * 业委会表
 *
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 17:38:41
 */
public interface CommitteeService extends IService<CommitteeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

