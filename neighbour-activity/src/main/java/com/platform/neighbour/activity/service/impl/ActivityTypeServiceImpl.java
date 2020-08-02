package com.platform.neighbour.activity.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.platform.neighbour.common.utils.PageUtils;
import com.platform.neighbour.common.utils.Query;

import com.platform.neighbour.activity.dao.ActivityTypeDao;
import com.platform.neighbour.activity.entity.ActivityTypeEntity;
import com.platform.neighbour.activity.service.ActivityTypeService;


@Service("activityTypeService")
public class ActivityTypeServiceImpl extends ServiceImpl<ActivityTypeDao, ActivityTypeEntity> implements ActivityTypeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ActivityTypeEntity> page = this.page(
                new Query<ActivityTypeEntity>().getPage(params),
                new QueryWrapper<ActivityTypeEntity>()
        );

        return new PageUtils(page);
    }

}