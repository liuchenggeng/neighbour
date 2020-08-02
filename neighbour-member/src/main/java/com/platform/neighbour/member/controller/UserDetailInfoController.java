package com.platform.neighbour.member.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.platform.neighbour.member.entity.UserDetailInfoEntity;
import com.platform.neighbour.member.service.UserDetailInfoService;
import com.platform.common.utils.PageUtils;
import com.platform.common.utils.R;



/**
 * 实名认证表
 *
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 17:35:40
 */
@RestController
@RequestMapping("member/userdetailinfo")
public class UserDetailInfoController {
    @Autowired
    private UserDetailInfoService userDetailInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("member:userdetailinfo:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = userDetailInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:userdetailinfo:info")
    public R info(@PathVariable("id") String id){
		UserDetailInfoEntity userDetailInfo = userDetailInfoService.getById(id);

        return R.ok().put("userDetailInfo", userDetailInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("member:userdetailinfo:save")
    public R save(@RequestBody UserDetailInfoEntity userDetailInfo){
		userDetailInfoService.save(userDetailInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("member:userdetailinfo:update")
    public R update(@RequestBody UserDetailInfoEntity userDetailInfo){
		userDetailInfoService.updateById(userDetailInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:userdetailinfo:delete")
    public R delete(@RequestBody String[] ids){
		userDetailInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
