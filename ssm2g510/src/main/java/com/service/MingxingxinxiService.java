package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MingxingxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MingxingxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MingxingxinxiView;


/**
 * 明星信息
 *
 * @author 
 * @email 
 * @date 2020-12-25 14:01:25
 */
public interface MingxingxinxiService extends IService<MingxingxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MingxingxinxiVO> selectListVO(Wrapper<MingxingxinxiEntity> wrapper);
   	
   	MingxingxinxiVO selectVO(@Param("ew") Wrapper<MingxingxinxiEntity> wrapper);
   	
   	List<MingxingxinxiView> selectListView(Wrapper<MingxingxinxiEntity> wrapper);
   	
   	MingxingxinxiView selectView(@Param("ew") Wrapper<MingxingxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MingxingxinxiEntity> wrapper);
   	
}

