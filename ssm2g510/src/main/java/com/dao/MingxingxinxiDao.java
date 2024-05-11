package com.dao;

import com.entity.MingxingxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MingxingxinxiVO;
import com.entity.view.MingxingxinxiView;


/**
 * 明星信息
 * 
 * @author 
 * @email 
 * @date 2020-12-25 14:01:25
 */
public interface MingxingxinxiDao extends BaseMapper<MingxingxinxiEntity> {
	
	List<MingxingxinxiVO> selectListVO(@Param("ew") Wrapper<MingxingxinxiEntity> wrapper);
	
	MingxingxinxiVO selectVO(@Param("ew") Wrapper<MingxingxinxiEntity> wrapper);
	
	List<MingxingxinxiView> selectListView(@Param("ew") Wrapper<MingxingxinxiEntity> wrapper);

	List<MingxingxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<MingxingxinxiEntity> wrapper);
	
	MingxingxinxiView selectView(@Param("ew") Wrapper<MingxingxinxiEntity> wrapper);
	
}
