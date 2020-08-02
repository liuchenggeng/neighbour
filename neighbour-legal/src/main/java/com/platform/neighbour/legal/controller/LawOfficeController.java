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

import com.platform.neighbour.legal.entity.LawOfficeEntity;
import com.platform.neighbour.legal.service.LawOfficeService;
import com.platform.common.utils.PageUtils;
import com.platform.common.utils.R;



/**
 * 法律事务所信息表
 *
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 22:14:04
 */
@RestController
@RequestMapping("legal/lawoffice")
public class LawOfficeController {
    @Autowired
    private LawOfficeService lawOfficeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("legal:lawoffice:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = lawOfficeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("legal:lawoffice:info")
    public R info(@PathVariable("id") String id){
		LawOfficeEntity lawOffice = lawOfficeService.getById(id);

        return R.ok().put("lawOffice", lawOffice);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("legal:lawoffice:save")
    public R save(@RequestBody LawOfficeEntity lawOffice){
		lawOfficeService.save(lawOffice);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("legal:lawoffice:update")
    public R update(@RequestBody LawOfficeEntity lawOffice){
		lawOfficeService.updateById(lawOffice);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("legal:lawoffice:delete")
    public R delete(@RequestBody String[] ids){
		lawOfficeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
