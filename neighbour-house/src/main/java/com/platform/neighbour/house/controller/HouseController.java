package com.platform.neighbour.house.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.platform.neighbour.house.entity.HouseEntity;
import com.platform.neighbour.house.service.HouseService;
import com.platform.common.utils.PageUtils;
import com.platform.common.utils.R;



/**
 * 小区信息表
 *
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 17:38:41
 */
@RestController
@RequestMapping("house/house")
public class HouseController {
    @Autowired
    private HouseService houseService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("house:house:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = houseService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("house:house:info")
    public R info(@PathVariable("id") String id){
		HouseEntity house = houseService.getById(id);

        return R.ok().put("house", house);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("house:house:save")
    public R save(@RequestBody HouseEntity house){
		houseService.save(house);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("house:house:update")
    public R update(@RequestBody HouseEntity house){
		houseService.updateById(house);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("house:house:delete")
    public R delete(@RequestBody String[] ids){
		houseService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
