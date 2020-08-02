package com.platform.neighbour.legal.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 法律事务所信息表
 * 
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 22:14:04
 */
@Data
@TableName("lms_law_office")
public class LawOfficeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 法律事务所ID
	 */
	@TableId
	private String id;
	/**
	 * 法律事务所名称
	 */
	private String officeName;
	/**
	 * 法律事务所介绍
	 */
	private String officeDesc;
	/**
	 * 法律事务所logo
	 */
	private String officeLogo;
	/**
	 * 法律事务所法人
	 */
	private String officeRepresentative;
	/**
	 * 律师事务所联系方式
	 */
	private String officeContact;
	/**
	 * 律师事务所地址
	 */
	private String officeAddress;
	/**
	 * 律师事务所营业执照图片地址
	 */
	private String officeBusinessLicense;
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
