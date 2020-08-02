package com.platform.neighbour.activity.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.platform.neighbour.common.utils.PageUtils;
import com.platform.neighbour.common.utils.Query;

import com.platform.neighbour.activity.dao.ActivityMemberDao;
import com.platform.neighbour.activity.entity.ActivityMemberEntity;
import com.platform.neighbour.activity.service.ActivityMemberService;


@Service("activityMemberService")
public class ActivityMemberServiceImpl extends ServiceImpl<ActivityMemberDao, ActivityMemberEntity> implements ActivityMemberService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ActivityMemberEntity> page = this.page(
                new Query<ActivityMemberEntity>().getPage(params),
                new QueryWrapper<ActivityMemberEntity>()
        );

        return new PageUtils(page);
    }

}