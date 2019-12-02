package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author kirin
 * @email kirin@atguigu.com
 * @date 2019-12-02 20:34:43
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
