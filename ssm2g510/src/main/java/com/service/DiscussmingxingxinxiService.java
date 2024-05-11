package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussmingxingxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussmingxingxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussmingxingxinxiView;


/**
 * 明星信息评论表
 *
 * @author 
 * @email 
 * @date 2020-12-25 14:01:25
 */
public interface DiscussmingxingxinxiService extends IService<DiscussmingxingxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussmingxingxinxiVO> selectListVO(Wrapper<DiscussmingxingxinxiEntity> wrapper);
   	
   	DiscussmingxingxinxiVO selectVO(@Param("ew") Wrapper<DiscussmingxingxinxiEntity> wrapper);
   	
   	List<DiscussmingxingxinxiView> selectListView(Wrapper<DiscussmingxingxinxiEntity> wrapper);
   	
   	DiscussmingxingxinxiView selectView(@Param("ew") Wrapper<DiscussmingxingxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussmingxingxinxiEntity> wrapper);
   	
}

