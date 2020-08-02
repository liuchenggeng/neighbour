package com.platform.neighbour.house.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.platform.common.utils.PageUtils;
import com.platform.common.utils.Query;

import com.platform.neighbour.house.dao.HouseImgDao;
import com.platform.neighbour.house.entity.HouseImgEntity;
import com.platform.neighbour.house.service.HouseImgService;


@Service("houseImgService")
public class HouseImgServiceImpl extends ServiceImpl<HouseImgDao, HouseImgEntity> implements HouseImgService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HouseImgEntity> page = this.page(
                new Query<HouseImgEntity>().getPage(params),
                new QueryWrapper<HouseImgEntity>()
        );

        return new PageUtils(page);
    }

}