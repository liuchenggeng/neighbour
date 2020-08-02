package com.platform.neighbour.house.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.platform.common.utils.PageUtils;
import com.platform.common.utils.Query;

import com.platform.neighbour.house.dao.CommitteeDao;
import com.platform.neighbour.house.entity.CommitteeEntity;
import com.platform.neighbour.house.service.CommitteeService;


@Service("committeeService")
public class CommitteeServiceImpl extends ServiceImpl<CommitteeDao, CommitteeEntity> implements CommitteeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CommitteeEntity> page = this.page(
                new Query<CommitteeEntity>().getPage(params),
                new QueryWrapper<CommitteeEntity>()
        );

        return new PageUtils(page);
    }

}