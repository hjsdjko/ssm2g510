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


import com.dao.MingxingxinxiDao;
import com.entity.MingxingxinxiEntity;
import com.service.MingxingxinxiService;
import com.entity.vo.MingxingxinxiVO;
import com.entity.view.MingxingxinxiView;

@Service("mingxingxinxiService")
public class MingxingxinxiServiceImpl extends ServiceImpl<MingxingxinxiDao, MingxingxinxiEntity> implements MingxingxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MingxingxinxiEntity> page = this.selectPage(
                new Query<MingxingxinxiEntity>(params).getPage(),
                new EntityWrapper<MingxingxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MingxingxinxiEntity> wrapper) {
		  Page<MingxingxinxiView> page =new Query<MingxingxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MingxingxinxiVO> selectListVO(Wrapper<MingxingxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MingxingxinxiVO selectVO(Wrapper<MingxingxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MingxingxinxiView> selectListView(Wrapper<MingxingxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MingxingxinxiView selectView(Wrapper<MingxingxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
