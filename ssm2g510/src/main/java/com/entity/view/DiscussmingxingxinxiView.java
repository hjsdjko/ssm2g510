package com.entity.view;

import com.entity.DiscussmingxingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 明星信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-25 14:01:25
 */
@TableName("discussmingxingxinxi")
public class DiscussmingxingxinxiView  extends DiscussmingxingxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussmingxingxinxiView(){
	}
 
 	public DiscussmingxingxinxiView(DiscussmingxingxinxiEntity discussmingxingxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussmingxingxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
