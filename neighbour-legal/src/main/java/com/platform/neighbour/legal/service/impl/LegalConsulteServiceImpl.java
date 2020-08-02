package com.platform.neighbour.legal.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.platform.common.utils.PageUtils;
import com.platform.common.utils.Query;

import com.platform.neighbour.legal.dao.LegalConsulteDao;
import com.platform.neighbour.legal.entity.LegalConsulteEntity;
import com.platform.neighbour.legal.service.LegalConsulteService;


@Service("legalConsulteService")
public class LegalConsulteServiceImpl extends ServiceImpl<LegalConsulteDao, LegalConsulteEntity> implements LegalConsulteService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<LegalConsulteEntity> page = this.page(
                new Query<LegalConsulteEntity>().getPage(params),
                new QueryWrapper<LegalConsulteEntity>()
        );

        return new PageUtils(page);
    }

}