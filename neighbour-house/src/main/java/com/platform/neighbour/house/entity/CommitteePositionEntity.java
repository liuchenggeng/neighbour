package com.platform.neighbour.house.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 业委会成员职位信息表
 * 
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 17:38:41
 */
@Data
@TableName("hms_committee_position")
public class CommitteePositionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 业委会职位ID
	 */
	@TableId
	private String id;
	/**
	 * 职位名称
	 */
	private String positionName;
	/**
	 * 职位数量
	 */
	private Integer positionNumber;
	/**
	 * 当前已有职位数量
	 */
	private Integer currentNumber;
	/**
	 * 剩余职位数量
	 */
	private Integer restNumber;
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
