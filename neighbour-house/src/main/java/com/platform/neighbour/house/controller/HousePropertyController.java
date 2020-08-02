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

import com.platform.neighbour.house.entity.HousePropertyEntity;
import com.platform.neighbour.house.service.HousePropertyService;
import com.platform.common.utils.PageUtils;
import com.platform.common.utils.R;



/**
 * 物业公司信息表
 *
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 17:38:41
 */
@RestController
@RequestMapping("house/houseproperty")
public class HousePropertyController {
    @Autowired
    private HousePropertyService housePropertyService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("house:houseproperty:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = housePropertyService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("house:houseproperty:info")
    public R info(@PathVariable("id") String id){
		HousePropertyEntity houseProperty = housePropertyService.getById(id);

        return R.ok().put("houseProperty", houseProperty);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("house:houseproperty:save")
    public R save(@RequestBody HousePropertyEntity houseProperty){
		housePropertyService.save(houseProperty);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("house:houseproperty:update")
    public R update(@RequestBody HousePropertyEntity houseProperty){
		housePropertyService.updateById(houseProperty);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("house:houseproperty:delete")
    public R delete(@RequestBody String[] ids){
		housePropertyService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
