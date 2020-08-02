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

import com.platform.neighbour.member.entity.ReceiveAddressEntity;
import com.platform.neighbour.member.service.ReceiveAddressService;
import com.platform.common.utils.PageUtils;
import com.platform.common.utils.R;



/**
 * 用户收货联系地址
 *
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 17:35:40
 */
@RestController
@RequestMapping("member/receiveaddress")
public class ReceiveAddressController {
    @Autowired
    private ReceiveAddressService receiveAddressService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("member:receiveaddress:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = receiveAddressService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:receiveaddress:info")
    public R info(@PathVariable("id") String id){
		ReceiveAddressEntity receiveAddress = receiveAddressService.getById(id);

        return R.ok().put("receiveAddress", receiveAddress);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("member:receiveaddress:save")
    public R save(@RequestBody ReceiveAddressEntity receiveAddress){
		receiveAddressService.save(receiveAddress);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("member:receiveaddress:update")
    public R update(@RequestBody ReceiveAddressEntity receiveAddress){
		receiveAddressService.updateById(receiveAddress);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:receiveaddress:delete")
    public R delete(@RequestBody String[] ids){
		receiveAddressService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
