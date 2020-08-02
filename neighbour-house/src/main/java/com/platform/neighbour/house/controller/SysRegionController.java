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

import com.platform.neighbour.house.entity.SysRegionEntity;
import com.platform.neighbour.house.service.SysRegionService;
import com.platform.common.utils.PageUtils;
import com.platform.common.utils.R;



/**
 * 全国区域表
 *
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 17:38:41
 */
@RestController
@RequestMapping("house/sysregion")
public class SysRegionController {
    @Autowired
    private SysRegionService sysRegionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("house:sysregion:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = sysRegionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("house:sysregion:info")
    public R info(@PathVariable("id") Integer id){
		SysRegionEntity sysRegion = sysRegionService.getById(id);

        return R.ok().put("sysRegion", sysRegion);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("house:sysregion:save")
    public R save(@RequestBody SysRegionEntity sysRegion){
		sysRegionService.save(sysRegion);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("house:sysregion:update")
    public R update(@RequestBody SysRegionEntity sysRegion){
		sysRegionService.updateById(sysRegion);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("house:sysregion:delete")
    public R delete(@RequestBody Integer[] ids){
		sysRegionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
