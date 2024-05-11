package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscussmingxingxinxiEntity;
import com.entity.view.DiscussmingxingxinxiView;

import com.service.DiscussmingxingxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 明星信息评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2020-12-25 14:01:25
 */
@RestController
@RequestMapping("/discussmingxingxinxi")
public class DiscussmingxingxinxiController {
    @Autowired
    private DiscussmingxingxinxiService discussmingxingxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussmingxingxinxiEntity discussmingxingxinxi, HttpServletRequest request){

        EntityWrapper<DiscussmingxingxinxiEntity> ew = new EntityWrapper<DiscussmingxingxinxiEntity>();
		PageUtils page = discussmingxingxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussmingxingxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussmingxingxinxiEntity discussmingxingxinxi, HttpServletRequest request){
        EntityWrapper<DiscussmingxingxinxiEntity> ew = new EntityWrapper<DiscussmingxingxinxiEntity>();
		PageUtils page = discussmingxingxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussmingxingxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussmingxingxinxiEntity discussmingxingxinxi){
       	EntityWrapper<DiscussmingxingxinxiEntity> ew = new EntityWrapper<DiscussmingxingxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussmingxingxinxi, "discussmingxingxinxi")); 
        return R.ok().put("data", discussmingxingxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussmingxingxinxiEntity discussmingxingxinxi){
        EntityWrapper< DiscussmingxingxinxiEntity> ew = new EntityWrapper< DiscussmingxingxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussmingxingxinxi, "discussmingxingxinxi")); 
		DiscussmingxingxinxiView discussmingxingxinxiView =  discussmingxingxinxiService.selectView(ew);
		return R.ok("查询明星信息评论表成功").put("data", discussmingxingxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussmingxingxinxiEntity discussmingxingxinxi = discussmingxingxinxiService.selectById(id);
        return R.ok().put("data", discussmingxingxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussmingxingxinxiEntity discussmingxingxinxi = discussmingxingxinxiService.selectById(id);
        return R.ok().put("data", discussmingxingxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussmingxingxinxiEntity discussmingxingxinxi, HttpServletRequest request){
    	discussmingxingxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussmingxingxinxi);

        discussmingxingxinxiService.insert(discussmingxingxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussmingxingxinxiEntity discussmingxingxinxi, HttpServletRequest request){
    	discussmingxingxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussmingxingxinxi);

        discussmingxingxinxiService.insert(discussmingxingxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscussmingxingxinxiEntity discussmingxingxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussmingxingxinxi);
        discussmingxingxinxiService.updateById(discussmingxingxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussmingxingxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscussmingxingxinxiEntity> wrapper = new EntityWrapper<DiscussmingxingxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discussmingxingxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
