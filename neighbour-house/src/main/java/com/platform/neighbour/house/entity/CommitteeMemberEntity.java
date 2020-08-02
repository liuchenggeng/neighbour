package com.platform.neighbour.house.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 业委会成员表
 * 
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 17:38:41
 */
@Data
@TableName("hms_committee_member")
public class CommitteeMemberEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 业主委员会成员ID,与用户ID一致
	 */
	@TableId
	private String id;
	/**
	 * 业主委员会ID
	 */
	private String committeeId;
	/**
	 * 用户ID.与用户表关联
	 */
	private String userId;
	/**
	 * 委员姓名
	 */
	private String memberName;
	/**
	 * 委员手机号
	 */
	private String memberMobile;
	/**
	 * 委员邮箱
	 */
	private String memberMail;
	/**
	 * 委员格言
	 */
	private String memberMotto;
	/**
	 * 委员备注
	 */
	private String memberRemark;
	/**
	 * 委员状态
	 */
	private String memberStatus;
	/**
	 * 委员详情
	 */
	private String memberContent;
	/**
	 * 委员性别
	 */
	private String memberSex;
	/**
	 * 委员教育
	 */
	private String memberEducation;
	/**
	 * 委员民族
	 */
	private String memberFolk;
	/**
	 * 委员年龄
	 */
	private Integer memberAge;
	/**
	 * 业委会职位ID
	 */
	private String memberPositionId;
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
