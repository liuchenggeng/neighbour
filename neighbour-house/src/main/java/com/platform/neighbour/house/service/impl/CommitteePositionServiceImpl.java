package com.platform.neighbour.house.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.platform.common.utils.PageUtils;
import com.platform.common.utils.Query;

import com.platform.neighbour.house.dao.CommitteePositionDao;
import com.platform.neighbour.house.entity.CommitteePositionEntity;
import com.platform.neighbour.house.service.CommitteePositionService;


@Service("committeePositionService")
public class CommitteePositionServiceImpl extends ServiceImpl<CommitteePositionDao, CommitteePositionEntity> implements CommitteePositionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CommitteePositionEntity> page = this.page(
                new Query<CommitteePositionEntity>().getPage(params),
                new QueryWrapper<CommitteePositionEntity>()
        );

        return new PageUtils(page);
    }

}