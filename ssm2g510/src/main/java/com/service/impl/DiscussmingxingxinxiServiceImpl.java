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


import com.dao.DiscussmingxingxinxiDao;
import com.entity.DiscussmingxingxinxiEntity;
import com.service.DiscussmingxingxinxiService;
import com.entity.vo.DiscussmingxingxinxiVO;
import com.entity.view.DiscussmingxingxinxiView;

@Service("discussmingxingxinxiService")
public class DiscussmingxingxinxiServiceImpl extends ServiceImpl<DiscussmingxingxinxiDao, DiscussmingxingxinxiEntity> implements DiscussmingxingxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussmingxingxinxiEntity> page = this.selectPage(
                new Query<DiscussmingxingxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussmingxingxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussmingxingxinxiEntity> wrapper) {
		  Page<DiscussmingxingxinxiView> page =new Query<DiscussmingxingxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussmingxingxinxiVO> selectListVO(Wrapper<DiscussmingxingxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussmingxingxinxiVO selectVO(Wrapper<DiscussmingxingxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussmingxingxinxiView> selectListView(Wrapper<DiscussmingxingxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussmingxingxinxiView selectView(Wrapper<DiscussmingxingxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
