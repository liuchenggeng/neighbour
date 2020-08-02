package com.platform.neighbour.activity.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 活动信息表
 * 
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 17:28:21
 */
@Data
@TableName("ams_activity")
public class ActivityEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 活动ID
	 */
	@TableId
	private String id;
	/**
	 * 活动类型
	 */
	private Integer actypeId;
	/**
	 * 活动标题
	 */
	private String title;
	/**
	 * 活动内容
	 */
	private String acContent;
	/**
	 * 活动地址
	 */
	private String acAddress;
	/**
	 * 活动容纳人数
	 */
	private Integer acAmount;
	/**
	 * 活动预算
	 */
	private Integer acBudget;
	/**
	 * 活动开始时间
	 */
	private Date timeStart;
	/**
	 * 活动结束时间
	 */
	private Date timeEnd;
	/**
	 * 逻辑删除字段[0不显示，1显示]
	 */
	@TableLogic
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
