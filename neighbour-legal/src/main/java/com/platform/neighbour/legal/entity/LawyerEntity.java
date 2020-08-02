package com.platform.neighbour.legal.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 律师信息表
 * 
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 22:14:04
 */
@Data
@TableName("lms_lawyer")
public class LawyerEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 律师ID,与用户表ID一致
	 */
	@TableId
	private String id;
	/**
	 * 律师事务所ID
	 */
	private String officeId;
	/**
	 * 律师资格证
	 */
	private String lawyerLicense;
	/**
	 * 律师级别,0=初级,1=中级,2=高级
	 */
	private Integer lawyerLevel;
	/**
	 * 律师简介
	 */
	private String lawyerDesc;
	/**
	 * 逻辑删除字段[0不显示，1显示]
	 */
	private Integer showStatus;
	/**
	 * 排序字段
	 */
	private Integer sort;
	/**
	 * 创建人名称
	 */
	private String createName;
	/**
	 * 创建人ID
	 */
	private String createBy;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新人名称
	 */
	private String updateName;
	/**
	 * 更新人ID
	 */
	private String updateBy;
	/**
	 * 更新时间
	 */
	private Date updateTime;

}
