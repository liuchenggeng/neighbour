package com.platform.neighbour.house.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 全国区域表
 * 
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 17:38:41
 */
@Data
@TableName("hms_sys_region")
public class SysRegionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 父ID
	 */
	private Integer parentId;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 类弄型1:省,2:市,3:区县,4:街道或镇
	 */
	private Integer type;
	/**
	 * 区域编码
	 */
	private Integer agencyId;

}
