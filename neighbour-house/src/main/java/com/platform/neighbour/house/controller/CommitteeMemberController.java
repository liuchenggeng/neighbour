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

import com.platform.neighbour.house.entity.CommitteeMemberEntity;
import com.platform.neighbour.house.service.CommitteeMemberService;
import com.platform.common.utils.PageUtils;
import com.platform.common.utils.R;



/**
 * 业委会成员表
 *
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 17:38:41
 */
@RestController
@RequestMapping("house/committeemember")
public class CommitteeMemberController {
    @Autowired
    private CommitteeMemberService committeeMemberService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("house:committeemember:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = committeeMemberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("house:committeemember:info")
    public R info(@PathVariable("id") String id){
		CommitteeMemberEntity committeeMember = committeeMemberService.getById(id);

        return R.ok().put("committeeMember", committeeMember);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("house:committeemember:save")
    public R save(@RequestBody CommitteeMemberEntity committeeMember){
		committeeMemberService.save(committeeMember);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("house:committeemember:update")
    public R update(@RequestBody CommitteeMemberEntity committeeMember){
		committeeMemberService.updateById(committeeMember);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("house:committeemember:delete")
    public R delete(@RequestBody String[] ids){
		committeeMemberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
