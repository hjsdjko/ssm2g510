package com.entity.view;

import com.entity.MingxingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 明星信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-25 14:01:25
 */
@TableName("mingxingxinxi")
public class MingxingxinxiView  extends MingxingxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MingxingxinxiView(){
	}
 
 	public MingxingxinxiView(MingxingxinxiEntity mingxingxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, mingxingxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
