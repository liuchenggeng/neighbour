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

import com.platform.neighbour.legal.entity.LegalConsulteCommentEntity;
import com.platform.neighbour.legal.service.LegalConsulteCommentService;
import com.platform.common.utils.PageUtils;
import com.platform.common.utils.R;



/**
 * 法律咨询应答记录表
 *
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 22:14:04
 */
@RestController
@RequestMapping("legal/legalconsultecomment")
public class LegalConsulteCommentController {
    @Autowired
    private LegalConsulteCommentService legalConsulteCommentService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("legal:legalconsultecomment:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = legalConsulteCommentService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("legal:legalconsultecomment:info")
    public R info(@PathVariable("id") String id){
		LegalConsulteCommentEntity legalConsulteComment = legalConsulteCommentService.getById(id);

        return R.ok().put("legalConsulteComment", legalConsulteComment);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("legal:legalconsultecomment:save")
    public R save(@RequestBody LegalConsulteCommentEntity legalConsulteComment){
		legalConsulteCommentService.save(legalConsulteComment);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("legal:legalconsultecomment:update")
    public R update(@RequestBody LegalConsulteCommentEntity legalConsulteComment){
		legalConsulteCommentService.updateById(legalConsulteComment);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("legal:legalconsultecomment:delete")
    public R delete(@RequestBody String[] ids){
		legalConsulteCommentService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
