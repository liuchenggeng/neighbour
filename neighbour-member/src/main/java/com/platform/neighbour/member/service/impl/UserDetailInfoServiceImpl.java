package com.platform.neighbour.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.platform.common.utils.PageUtils;
import com.platform.common.utils.Query;

import com.platform.neighbour.member.dao.UserDetailInfoDao;
import com.platform.neighbour.member.entity.UserDetailInfoEntity;
import com.platform.neighbour.member.service.UserDetailInfoService;


@Service("userDetailInfoService")
public class UserDetailInfoServiceImpl extends ServiceImpl<UserDetailInfoDao, UserDetailInfoEntity> implements UserDetailInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UserDetailInfoEntity> page = this.page(
                new Query<UserDetailInfoEntity>().getPage(params),
                new QueryWrapper<UserDetailInfoEntity>()
        );

        return new PageUtils(page);
    }

}