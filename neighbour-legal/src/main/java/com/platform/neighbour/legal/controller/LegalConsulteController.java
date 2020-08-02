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

import com.platform.neighbour.legal.entity.LegalConsulteEntity;
import com.platform.neighbour.legal.service.LegalConsulteService;
import com.platform.common.utils.PageUtils;
import com.platform.common.utils.R;



/**
 * 法律咨询信息表
 *
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 22:14:04
 */
@RestController
@RequestMapping("legal/legalconsulte")
public class LegalConsulteController {
    @Autowired
    private LegalConsulteService legalConsulteService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("legal:legalconsulte:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = legalConsulteService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("legal:legalconsulte:info")
    public R info(@PathVariable("id") String id){
		LegalConsulteEntity legalConsulte = legalConsulteService.getById(id);

        return R.ok().put("legalConsulte", legalConsulte);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("legal:legalconsulte:save")
    public R save(@RequestBody LegalConsulteEntity legalConsulte){
		legalConsulteService.save(legalConsulte);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("legal:legalconsulte:update")
    public R update(@RequestBody LegalConsulteEntity legalConsulte){
		legalConsulteService.updateById(legalConsulte);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("legal:legalconsulte:delete")
    public R delete(@RequestBody String[] ids){
		legalConsulteService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
