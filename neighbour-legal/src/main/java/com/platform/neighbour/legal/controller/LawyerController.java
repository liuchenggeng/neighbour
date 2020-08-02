package com.platform.neighbour.legal.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.platform.neighbour.legal.entity.LawyerEntity;
import com.platform.neighbour.legal.service.LawyerService;
import com.platform.common.utils.PageUtils;
import com.platform.common.utils.R;



/**
 * 律师信息表
 *
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 22:14:04
 */
@RestController
@RequestMapping("legal/lawyer")
public class LawyerController {
    @Autowired
    private LawyerService lawyerService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("legal:lawyer:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = lawyerService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("legal:lawyer:info")
    public R info(@PathVariable("id") String id){
		LawyerEntity lawyer = lawyerService.getById(id);

        return R.ok().put("lawyer", lawyer);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("legal:lawyer:save")
    public R save(@RequestBody LawyerEntity lawyer){
		lawyerService.save(lawyer);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("legal:lawyer:update")
    public R update(@RequestBody LawyerEntity lawyer){
		lawyerService.updateById(lawyer);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("legal:lawyer:delete")
    public R delete(@RequestBody String[] ids){
		lawyerService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
