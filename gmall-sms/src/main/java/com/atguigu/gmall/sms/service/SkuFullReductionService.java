package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.SkuFullReductionEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 商品满减信息
 *
 * @author kirin
 * @email kirin@atguigu.com
 * @date 2019-12-02 20:19:58
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageVo queryPage(QueryCondition params);
}

