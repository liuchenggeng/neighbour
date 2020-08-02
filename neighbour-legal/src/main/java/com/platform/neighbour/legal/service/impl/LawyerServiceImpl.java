package com.platform.neighbour.legal.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.platform.common.utils.PageUtils;
import com.platform.common.utils.Query;

import com.platform.neighbour.legal.dao.LawyerDao;
import com.platform.neighbour.legal.entity.LawyerEntity;
import com.platform.neighbour.legal.service.LawyerService;


@Service("lawyerService")
public class LawyerServiceImpl extends ServiceImpl<LawyerDao, LawyerEntity> implements LawyerService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<LawyerEntity> page = this.page(
                new Query<LawyerEntity>().getPage(params),
                new QueryWrapper<LawyerEntity>()
        );

        return new PageUtils(page);
    }

}