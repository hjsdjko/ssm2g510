package com.dao;

import com.entity.MingxingfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MingxingfenleiVO;
import com.entity.view.MingxingfenleiView;


/**
 * 明星分类
 * 
 * @author 
 * @email 
 * @date 2020-12-25 14:01:24
 */
public interface MingxingfenleiDao extends BaseMapper<MingxingfenleiEntity> {
	
	List<MingxingfenleiVO> selectListVO(@Param("ew") Wrapper<MingxingfenleiEntity> wrapper);
	
	MingxingfenleiVO selectVO(@Param("ew") Wrapper<MingxingfenleiEntity> wrapper);
	
	List<MingxingfenleiView> selectListView(@Param("ew") Wrapper<MingxingfenleiEntity> wrapper);

	List<MingxingfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<MingxingfenleiEntity> wrapper);
	
	MingxingfenleiView selectView(@Param("ew") Wrapper<MingxingfenleiEntity> wrapper);
	
}
