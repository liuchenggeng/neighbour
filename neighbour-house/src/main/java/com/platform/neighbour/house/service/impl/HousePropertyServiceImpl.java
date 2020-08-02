package com.platform.neighbour.house.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.platform.common.utils.PageUtils;
import com.platform.common.utils.Query;

import com.platform.neighbour.house.dao.HousePropertyDao;
import com.platform.neighbour.house.entity.HousePropertyEntity;
import com.platform.neighbour.house.service.HousePropertyService;


@Service("housePropertyService")
public class HousePropertyServiceImpl extends ServiceImpl<HousePropertyDao, HousePropertyEntity> implements HousePropertyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HousePropertyEntity> page = this.page(
                new Query<HousePropertyEntity>().getPage(params),
                new QueryWrapper<HousePropertyEntity>()
        );

        return new PageUtils(page);
    }

}