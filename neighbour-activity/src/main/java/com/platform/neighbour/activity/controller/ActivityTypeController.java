package com.platform.neighbour.activity.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.platform.neighbour.activity.entity.ActivityTypeEntity;
import com.platform.neighbour.activity.service.ActivityTypeService;
import com.platform.neighbour.common.utils.PageUtils;
import com.platform.neighbour.common.utils.R;



/**
 * 活动类型表
 *
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 17:28:21
 */
@RestController
@RequestMapping("activity/activitytype")
public class ActivityTypeController {
    @Autowired
    private ActivityTypeService activityTypeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("activity:activitytype:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = activityTypeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("activity:activitytype:info")
    public R info(@PathVariable("id") Integer id){
		ActivityTypeEntity activityType = activityTypeService.getById(id);

        return R.ok().put("activityType", activityType);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("activity:activitytype:save")
    public R save(@RequestBody ActivityTypeEntity activityType){
		activityTypeService.save(activityType);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("activity:activitytype:update")
    public R update(@RequestBody ActivityTypeEntity activityType){
		activityTypeService.updateById(activityType);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("activity:activitytype:delete")
    public R delete(@RequestBody Integer[] ids){
		activityTypeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
