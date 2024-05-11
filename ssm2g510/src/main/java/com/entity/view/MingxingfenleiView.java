package com.entity.view;

import com.entity.MingxingfenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 明星分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-25 14:01:24
 */
@TableName("mingxingfenlei")
public class MingxingfenleiView  extends MingxingfenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MingxingfenleiView(){
	}
 
 	public MingxingfenleiView(MingxingfenleiEntity mingxingfenleiEntity){
 	try {
			BeanUtils.copyProperties(this, mingxingfenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
