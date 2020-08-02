package com.platform.neighbour.activity.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 活动类型表
 * 
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 17:28:21
 */
@Data
@TableName("ams_activity_type")
public class ActivityTypeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 活动类型ID
	 */
	@TableId
	private Integer id;
	/**
	 * 活动类型名称
	 */
	private String typeName;
	/**
	 * 类型级别
	 */
	private Integer level;
	/**
	 * 父活动类型
	 */
	private Integer parentId;
	/**
	 * 类型图标
	 */
	private String typeIcon;
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
