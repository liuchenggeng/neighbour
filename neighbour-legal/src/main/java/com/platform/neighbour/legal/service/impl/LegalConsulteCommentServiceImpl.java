package com.platform.neighbour.legal.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.platform.common.utils.PageUtils;
import com.platform.common.utils.Query;

import com.platform.neighbour.legal.dao.LegalConsulteCommentDao;
import com.platform.neighbour.legal.entity.LegalConsulteCommentEntity;
import com.platform.neighbour.legal.service.LegalConsulteCommentService;


@Service("legalConsulteCommentService")
public class LegalConsulteCommentServiceImpl extends ServiceImpl<LegalConsulteCommentDao, LegalConsulteCommentEntity> implements LegalConsulteCommentService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<LegalConsulteCommentEntity> page = this.page(
                new Query<LegalConsulteCommentEntity>().getPage(params),
                new QueryWrapper<LegalConsulteCommentEntity>()
        );

        return new PageUtils(page);
    }

}