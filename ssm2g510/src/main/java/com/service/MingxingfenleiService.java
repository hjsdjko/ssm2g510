package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MingxingfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MingxingfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MingxingfenleiView;


/**
 * 明星分类
 *
 * @author 
 * @email 
 * @date 2020-12-25 14:01:24
 */
public interface MingxingfenleiService extends IService<MingxingfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MingxingfenleiVO> selectListVO(Wrapper<MingxingfenleiEntity> wrapper);
   	
   	MingxingfenleiVO selectVO(@Param("ew") Wrapper<MingxingfenleiEntity> wrapper);
   	
   	List<MingxingfenleiView> selectListView(Wrapper<MingxingfenleiEntity> wrapper);
   	
   	MingxingfenleiView selectView(@Param("ew") Wrapper<MingxingfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MingxingfenleiEntity> wrapper);
   	
}

