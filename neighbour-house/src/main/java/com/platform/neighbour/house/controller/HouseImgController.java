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

import com.platform.neighbour.house.entity.HouseImgEntity;
import com.platform.neighbour.house.service.HouseImgService;
import com.platform.common.utils.PageUtils;
import com.platform.common.utils.R;



/**
 * 小区图片信息表
 *
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 17:38:41
 */
@RestController
@RequestMapping("house/houseimg")
public class HouseImgController {
    @Autowired
    private HouseImgService houseImgService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("house:houseimg:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = houseImgService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("house:houseimg:info")
    public R info(@PathVariable("id") String id){
		HouseImgEntity houseImg = houseImgService.getById(id);

        return R.ok().put("houseImg", houseImg);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("house:houseimg:save")
    public R save(@RequestBody HouseImgEntity houseImg){
		houseImgService.save(houseImg);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("house:houseimg:update")
    public R update(@RequestBody HouseImgEntity houseImg){
		houseImgService.updateById(houseImg);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("house:houseimg:delete")
    public R delete(@RequestBody String[] ids){
		houseImgService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
