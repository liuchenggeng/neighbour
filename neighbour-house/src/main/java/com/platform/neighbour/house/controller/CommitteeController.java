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

import com.platform.neighbour.house.entity.CommitteeEntity;
import com.platform.neighbour.house.service.CommitteeService;
import com.platform.common.utils.PageUtils;
import com.platform.common.utils.R;



/**
 * 业委会表
 *
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 17:38:41
 */
@RestController
@RequestMapping("house/committee")
public class CommitteeController {
    @Autowired
    private CommitteeService committeeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("house:committee:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = committeeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("house:committee:info")
    public R info(@PathVariable("id") String id){
		CommitteeEntity committee = committeeService.getById(id);

        return R.ok().put("committee", committee);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("house:committee:save")
    public R save(@RequestBody CommitteeEntity committee){
		committeeService.save(committee);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("house:committee:update")
    public R update(@RequestBody CommitteeEntity committee){
		committeeService.updateById(committee);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("house:committee:delete")
    public R delete(@RequestBody String[] ids){
		committeeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
