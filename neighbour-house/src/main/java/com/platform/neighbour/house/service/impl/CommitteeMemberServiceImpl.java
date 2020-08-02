package com.platform.neighbour.house.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.platform.common.utils.PageUtils;
import com.platform.common.utils.Query;

import com.platform.neighbour.house.dao.CommitteeMemberDao;
import com.platform.neighbour.house.entity.CommitteeMemberEntity;
import com.platform.neighbour.house.service.CommitteeMemberService;


@Service("committeeMemberService")
public class CommitteeMemberServiceImpl extends ServiceImpl<CommitteeMemberDao, CommitteeMemberEntity> implements CommitteeMemberService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CommitteeMemberEntity> page = this.page(
                new Query<CommitteeMemberEntity>().getPage(params),
                new QueryWrapper<CommitteeMemberEntity>()
        );

        return new PageUtils(page);
    }

}