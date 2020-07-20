package com.platform.gulimall.member.feign;

import com.platform.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 提交人：刘承耿
 * 创建时间：2020/7/18 0:55
 * 项目名称：gulimall
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/getCoupon")
    //@RequiresPermissions("coupon:coupon:list")
    public R getCoupon();
}
