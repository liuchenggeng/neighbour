package com.platform.neighbour.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.platform.common.utils.PageUtils;
import com.platform.common.utils.Query;

import com.platform.neighbour.member.dao.ReceiveAddressDao;
import com.platform.neighbour.member.entity.ReceiveAddressEntity;
import com.platform.neighbour.member.service.ReceiveAddressService;


@Service("receiveAddressService")
public class ReceiveAddressServiceImpl extends ServiceImpl<ReceiveAddressDao, ReceiveAddressEntity> implements ReceiveAddressService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ReceiveAddressEntity> page = this.page(
                new Query<ReceiveAddressEntity>().getPage(params),
                new QueryWrapper<ReceiveAddressEntity>()
        );

        return new PageUtils(page);
    }

}