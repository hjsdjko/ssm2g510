package com.dao;

import com.entity.DiscussmingxingxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussmingxingxinxiVO;
import com.entity.view.DiscussmingxingxinxiView;


/**
 * 明星信息评论表
 * 
 * @author 
 * @email 
 * @date 2020-12-25 14:01:25
 */
public interface DiscussmingxingxinxiDao extends BaseMapper<DiscussmingxingxinxiEntity> {
	
	List<DiscussmingxingxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussmingxingxinxiEntity> wrapper);
	
	DiscussmingxingxinxiVO selectVO(@Param("ew") Wrapper<DiscussmingxingxinxiEntity> wrapper);
	
	List<DiscussmingxingxinxiView> selectListView(@Param("ew") Wrapper<DiscussmingxingxinxiEntity> wrapper);

	List<DiscussmingxingxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussmingxingxinxiEntity> wrapper);
	
	DiscussmingxingxinxiView selectView(@Param("ew") Wrapper<DiscussmingxingxinxiEntity> wrapper);
	
}
