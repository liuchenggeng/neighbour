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

import com.platform.neighbour.member.entity.UserLoginLogEntity;
import com.platform.neighbour.member.service.UserLoginLogService;
import com.platform.common.utils.PageUtils;
import com.platform.common.utils.R;



/**
 * 用户登陆记录信息表
 *
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 17:35:40
 */
@RestController
@RequestMapping("member/userloginlog")
public class UserLoginLogController {
    @Autowired
    private UserLoginLogService userLoginLogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("member:userloginlog:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = userLoginLogService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:userloginlog:info")
    public R info(@PathVariable("id") Long id){
		UserLoginLogEntity userLoginLog = userLoginLogService.getById(id);

        return R.ok().put("userLoginLog", userLoginLog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("member:userloginlog:save")
    public R save(@RequestBody UserLoginLogEntity userLoginLog){
		userLoginLogService.save(userLoginLog);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("member:userloginlog:update")
    public R update(@RequestBody UserLoginLogEntity userLoginLog){
		userLoginLogService.updateById(userLoginLog);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:userloginlog:delete")
    public R delete(@RequestBody Long[] ids){
		userLoginLogService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
