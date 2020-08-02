package com.platform.neighbour.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户收货联系地址
 * 
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 17:35:40
 */
@Data
@TableName("ums_receive_address")
public class ReceiveAddressEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String id;
	/**
	 * 用户ID
	 */
	private String userId;
	/**
	 * 收货人姓名
	 */
	private String userName;
	/**
	 * 手机
	 */
	private String telNumber;
	/**
	 * 邮编
	 */
	private String postalCode;
	/**
	 * 收货地址国家码
	 */
	private String nationalCode;
	/**
	 * 省
	 */
	private String provinceName;
	/**
	 * 市
	 */
	private String cityName;
	/**
	 * 区
	 */
	private String countyName;
	/**
	 * 详细收货地址信息
	 */
	private String detailInfo;
	/**
	 * 
	 */
	private Integer isDefault;
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
