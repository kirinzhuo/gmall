package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author kirin
 * @email kirin@atguigu.com
 * @date 2019-12-02 20:19:58
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
