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

import com.platform.neighbour.house.entity.CommitteePositionEntity;
import com.platform.neighbour.house.service.CommitteePositionService;
import com.platform.common.utils.PageUtils;
import com.platform.common.utils.R;



/**
 * 业委会成员职位信息表
 *
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 17:38:41
 */
@RestController
@RequestMapping("house/committeeposition")
public class CommitteePositionController {
    @Autowired
    private CommitteePositionService committeePositionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("house:committeeposition:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = committeePositionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("house:committeeposition:info")
    public R info(@PathVariable("id") String id){
		CommitteePositionEntity committeePosition = committeePositionService.getById(id);

        return R.ok().put("committeePosition", committeePosition);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("house:committeeposition:save")
    public R save(@RequestBody CommitteePositionEntity committeePosition){
		committeePositionService.save(committeePosition);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("house:committeeposition:update")
    public R update(@RequestBody CommitteePositionEntity committeePosition){
		committeePositionService.updateById(committeePosition);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("house:committeeposition:delete")
    public R delete(@RequestBody String[] ids){
		committeePositionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
