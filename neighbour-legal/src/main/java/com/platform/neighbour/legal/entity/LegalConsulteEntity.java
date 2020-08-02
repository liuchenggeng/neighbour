package com.platform.neighbour.legal.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 法律咨询信息表
 * 
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 22:14:04
 */
@Data
@TableName("lms_legal_consulte")
public class LegalConsulteEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 法律咨询ID
	 */
	@TableId
	private String id;
	/**
	 * 律师事务所ID
	 */
	private String officeId;
	/**
	 * 法律咨询编号
	 */
	private String lagelSn;
	/**
	 * 标题
	 */
	private String title;
	/**
	 * 详情内容
	 */
	private String content;
	/**
	 * 咨询人ID=用户信息表ID
	 */
	private String userId;
	/**
	 * 咨询人名字
	 */
	private String consulterName;
	/**
	 * 咨询人联系方式
	 */
	private String consulterContact;
	/**
	 * 咨询人地址
	 */
	private String consulterAddress;
	/**
	 * 咨询状态0=未应答,1=已应答,2=已关闭
	 */
	private Integer status;
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
