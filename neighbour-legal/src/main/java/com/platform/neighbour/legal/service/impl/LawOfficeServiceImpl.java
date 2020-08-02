package com.platform.neighbour.legal.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.platform.common.utils.PageUtils;
import com.platform.common.utils.Query;

import com.platform.neighbour.legal.dao.LawOfficeDao;
import com.platform.neighbour.legal.entity.LawOfficeEntity;
import com.platform.neighbour.legal.service.LawOfficeService;


@Service("lawOfficeService")
public class LawOfficeServiceImpl extends ServiceImpl<LawOfficeDao, LawOfficeEntity> implements LawOfficeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<LawOfficeEntity> page = this.page(
                new Query<LawOfficeEntity>().getPage(params),
                new QueryWrapper<LawOfficeEntity>()
        );

        return new PageUtils(page);
    }

}