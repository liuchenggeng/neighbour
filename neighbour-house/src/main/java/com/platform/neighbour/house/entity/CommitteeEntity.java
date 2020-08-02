package com.platform.neighbour.house.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 业委会表
 * 
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 17:38:41
 */
@Data
@TableName("hms_committee")
public class CommitteeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 业委会数据ID
	 */
	@TableId
	private String id;
	/**
	 * 业委会名称
	 */
	private String committeeName;
	/**
	 * 小区ID
	 */
	private String houseId;
	/**
	 * 业委会状态(0未成立,1发起中,2已成立,3过期)
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
