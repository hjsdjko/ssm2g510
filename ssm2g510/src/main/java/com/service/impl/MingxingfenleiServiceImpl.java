package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.MingxingfenleiDao;
import com.entity.MingxingfenleiEntity;
import com.service.MingxingfenleiService;
import com.entity.vo.MingxingfenleiVO;
import com.entity.view.MingxingfenleiView;

@Service("mingxingfenleiService")
public class MingxingfenleiServiceImpl extends ServiceImpl<MingxingfenleiDao, MingxingfenleiEntity> implements MingxingfenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MingxingfenleiEntity> page = this.selectPage(
                new Query<MingxingfenleiEntity>(params).getPage(),
                new EntityWrapper<MingxingfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MingxingfenleiEntity> wrapper) {
		  Page<MingxingfenleiView> page =new Query<MingxingfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MingxingfenleiVO> selectListVO(Wrapper<MingxingfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MingxingfenleiVO selectVO(Wrapper<MingxingfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MingxingfenleiView> selectListView(Wrapper<MingxingfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MingxingfenleiView selectView(Wrapper<MingxingfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
