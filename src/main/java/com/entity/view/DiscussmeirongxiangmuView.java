package com.entity.view;

import com.entity.DiscussmeirongxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 美容项目评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-21 16:30:07
 */
@TableName("discussmeirongxiangmu")
public class DiscussmeirongxiangmuView  extends DiscussmeirongxiangmuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussmeirongxiangmuView(){
	}
 
 	public DiscussmeirongxiangmuView(DiscussmeirongxiangmuEntity discussmeirongxiangmuEntity){
 	try {
			BeanUtils.copyProperties(this, discussmeirongxiangmuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
