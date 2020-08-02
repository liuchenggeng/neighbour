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

import com.platform.neighbour.activity.entity.ActivityMemberEntity;
import com.platform.neighbour.activity.service.ActivityMemberService;
import com.platform.neighbour.common.utils.PageUtils;
import com.platform.neighbour.common.utils.R;



/**
 * 活动参与人信息表
 *
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 17:28:21
 */
@RestController
@RequestMapping("activity/activitymember")
public class ActivityMemberController {
    @Autowired
    private ActivityMemberService activityMemberService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("activity:activitymember:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = activityMemberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("activity:activitymember:info")
    public R info(@PathVariable("id") String id){
		ActivityMemberEntity activityMember = activityMemberService.getById(id);

        return R.ok().put("activityMember", activityMember);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("activity:activitymember:save")
    public R save(@RequestBody ActivityMemberEntity activityMember){
		activityMemberService.save(activityMember);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("activity:activitymember:update")
    public R update(@RequestBody ActivityMemberEntity activityMember){
		activityMemberService.updateById(activityMember);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("activity:activitymember:delete")
    public R delete(@RequestBody String[] ids){
		activityMemberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
