package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author susu
 * @email a951666991@gmail.com
 * @date 2022-12-01 09:41:43
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
