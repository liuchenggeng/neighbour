package com.platform.neighbour.house.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 小区信息表
 * 
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 17:38:41
 */
@Data
@TableName("hms_house")
public class HouseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 小区ID
	 */
	@TableId
	private String id;
	/**
	 * 省份ID
	 */
	private String provinceId;
	/**
	 * 地区ID
	 */
	private String cityId;
	/**
	 * 县区ID
	 */
	private String countyId;
	/**
	 * 小区名称
	 */
	private String houseName;
	/**
	 * 小区开发商
	 */
	private String houseBuilder;
	/**
	 * 小区修建时间
	 */
	private Date houseBuildTime;
	/**
	 * 小区简介
	 */
	private String houseBrief;
	/**
	 * 小区详情
	 */
	private String houseDetail;
	/**
	 * 小区价格
	 */
	private Integer housePrice;
	/**
	 * 小区图片预览
	 */
	private String houseImgView;
	/**
	 * 物业公司ID
	 */
	private String propertyId;
	/**
	 * 物业费价格
	 */
	private Float propertyPrice;
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
