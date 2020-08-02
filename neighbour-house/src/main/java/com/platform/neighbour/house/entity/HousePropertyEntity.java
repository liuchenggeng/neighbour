package com.platform.neighbour.house.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 物业公司信息表
 * 
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 17:38:41
 */
@Data
@TableName("hms_house_property")
public class HousePropertyEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 物业公司ID
	 */
	@TableId
	private String id;
	/**
	 * 小区 ID
	 */
	private String houseId;
	/**
	 * 物业公司名称
	 */
	private String propertyName;
	/**
	 * 物业公司图标
	 */
	private String propertyIcon;
	/**
	 * 物业公司说明
	 */
	private String propertyDesc;
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
