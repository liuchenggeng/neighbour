package com.platform.neighbour.house.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.platform.common.utils.PageUtils;
import com.platform.neighbour.house.entity.CommitteeMemberEntity;

import java.util.Map;

/**
 * 业委会成员表
 *
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 17:38:41
 */
public interface CommitteeMemberService extends IService<CommitteeMemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

