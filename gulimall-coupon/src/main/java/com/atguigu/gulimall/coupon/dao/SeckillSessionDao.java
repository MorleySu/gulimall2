package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author susu
 * @email a951666991@gmail.com
 * @date 2022-12-01 09:41:43
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
