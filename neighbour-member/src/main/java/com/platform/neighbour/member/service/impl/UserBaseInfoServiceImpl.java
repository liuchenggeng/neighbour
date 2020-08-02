package com.platform.neighbour.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.platform.common.utils.PageUtils;
import com.platform.common.utils.Query;

import com.platform.neighbour.member.dao.UserBaseInfoDao;
import com.platform.neighbour.member.entity.UserBaseInfoEntity;
import com.platform.neighbour.member.service.UserBaseInfoService;


@Service("userBaseInfoService")
public class UserBaseInfoServiceImpl extends ServiceImpl<UserBaseInfoDao, UserBaseInfoEntity> implements UserBaseInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UserBaseInfoEntity> page = this.page(
                new Query<UserBaseInfoEntity>().getPage(params),
                new QueryWrapper<UserBaseInfoEntity>()
        );

        return new PageUtils(page);
    }

}