package com.atguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.coupon.entity.SkuBoundsEntity;

import java.util.Map;

/**
 * 商品sku积分设置
 *
 * @author susu
 * @email a951666991@gmail.com
 * @date 2022-12-01 09:41:43
 */
public interface SkuBoundsService extends IService<SkuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

