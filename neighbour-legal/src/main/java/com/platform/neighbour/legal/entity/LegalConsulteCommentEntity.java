package com.platform.neighbour.legal.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 法律咨询应答记录表
 * 
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 22:14:04
 */
@Data
@TableName("lms_legal_consulte_comment")
public class LegalConsulteCommentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 法律咨询应答ID
	 */
	@TableId
	private String id;
	/**
	 * 法律咨询ID
	 */
	private String consultId;
	/**
	 * 留言内容
	 */
	private String comment;
	/**
	 * 用户ID
	 */
	private String userId;
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
