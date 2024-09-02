package com.entity.vo;

import com.entity.MeirongxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 美容项目
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-21 16:30:07
 */
public class MeirongxiangmuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 项目名称
	 */
	
	private String xiangmumingcheng;
		
	/**
	 * 项目部门
	 */
	
	private String xiangmubumen;
		
	/**
	 * 项目类型
	 */
	
	private String xiangmuleixing;
		
	/**
	 * 项目封面
	 */
	
	private String xiangmufengmian;
		
	/**
	 * 项目费用
	 */
	
	private Float xiangmufeiyong;
		
	/**
	 * 美容师工号
	 */
	
	private String meirongshigonghao;
		
	/**
	 * 美容师姓名
	 */
	
	private String meirongshixingming;
		
	/**
	 * 产品名称
	 */
	
	private String chanpinmingcheng;
		
	/**
	 * 注意事项
	 */
	
	private String zhuyishixiang;
		
	/**
	 * 项目内容
	 */
	
	private String xiangmuneirong;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：项目名称
	 */
	 
	public void setXiangmumingcheng(String xiangmumingcheng) {
		this.xiangmumingcheng = xiangmumingcheng;
	}
	
	/**
	 * 获取：项目名称
	 */
	public String getXiangmumingcheng() {
		return xiangmumingcheng;
	}
				
	
	/**
	 * 设置：项目部门
	 */
	 
	public void setXiangmubumen(String xiangmubumen) {
		this.xiangmubumen = xiangmubumen;
	}
	
	/**
	 * 获取：项目部门
	 */
	public String getXiangmubumen() {
		return xiangmubumen;
	}
				
	
	/**
	 * 设置：项目类型
	 */
	 
	public void setXiangmuleixing(String xiangmuleixing) {
		this.xiangmuleixing = xiangmuleixing;
	}
	
	/**
	 * 获取：项目类型
	 */
	public String getXiangmuleixing() {
		return xiangmuleixing;
	}
				
	
	/**
	 * 设置：项目封面
	 */
	 
	public void setXiangmufengmian(String xiangmufengmian) {
		this.xiangmufengmian = xiangmufengmian;
	}
	
	/**
	 * 获取：项目封面
	 */
	public String getXiangmufengmian() {
		return xiangmufengmian;
	}
				
	
	/**
	 * 设置：项目费用
	 */
	 
	public void setXiangmufeiyong(Float xiangmufeiyong) {
		this.xiangmufeiyong = xiangmufeiyong;
	}
	
	/**
	 * 获取：项目费用
	 */
	public Float getXiangmufeiyong() {
		return xiangmufeiyong;
	}
				
	
	/**
	 * 设置：美容师工号
	 */
	 
	public void setMeirongshigonghao(String meirongshigonghao) {
		this.meirongshigonghao = meirongshigonghao;
	}
	
	/**
	 * 获取：美容师工号
	 */
	public String getMeirongshigonghao() {
		return meirongshigonghao;
	}
				
	
	/**
	 * 设置：美容师姓名
	 */
	 
	public void setMeirongshixingming(String meirongshixingming) {
		this.meirongshixingming = meirongshixingming;
	}
	
	/**
	 * 获取：美容师姓名
	 */
	public String getMeirongshixingming() {
		return meirongshixingming;
	}
				
	
	/**
	 * 设置：产品名称
	 */
	 
	public void setChanpinmingcheng(String chanpinmingcheng) {
		this.chanpinmingcheng = chanpinmingcheng;
	}
	
	/**
	 * 获取：产品名称
	 */
	public String getChanpinmingcheng() {
		return chanpinmingcheng;
	}
				
	
	/**
	 * 设置：注意事项
	 */
	 
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}
				
	
	/**
	 * 设置：项目内容
	 */
	 
	public void setXiangmuneirong(String xiangmuneirong) {
		this.xiangmuneirong = xiangmuneirong;
	}
	
	/**
	 * 获取：项目内容
	 */
	public String getXiangmuneirong() {
		return xiangmuneirong;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
