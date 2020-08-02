package com.platform.neighbour.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.platform.common.utils.PageUtils;
import com.platform.neighbour.member.entity.ReceiveAddressEntity;

import java.util.Map;

/**
 * 用户收货联系地址
 *
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 17:35:40
 */
public interface ReceiveAddressService extends IService<ReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

