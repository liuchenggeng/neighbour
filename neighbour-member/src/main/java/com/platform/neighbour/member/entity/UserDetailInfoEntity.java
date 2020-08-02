package com.platform.neighbour.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 实名认证表
 * 
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 17:35:40
 */
@Data
@TableName("ums_user_detail_info")
public class UserDetailInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 与用户基本信息表一致
	 */
	@TableId
	private String id;
	/**
	 * 实名认证后的真实用户名
	 */
	private String realName;
	/**
	 * 用户手机
	 */
	private String mobile;
	/**
	 * 手机验证码
	 */
	private String mobileCode;
	/**
	 * 小区ID号
	 */
	private String houseId;
	/**
	 * 当前实名认证的状态
	 */
	private String status;
	/**
	 * 认证类型[0=身份证1=护照]
	 */
	private String type;
	/**
	 * 用户头像地址
	 */
	private String imgUrl;
	/**
	 * 楼栋
	 */
	private String housingNum;
	/**
	 * 门牌号
	 */
	private String pepNum;
	/**
	 * 身份证号
	 */
	private String idCard;
	/**
	 * 身份证门牌号
	 */
	private String idAddresss;
	/**
	 * 身份证正面照片地址
	 */
	private String idCardImgA;
	/**
	 * 反面照片地址
	 */
	private String idCardImgB;
	/**
	 * 护照号
	 */
	private String passportNum;
	/**
	 * 护照信息页
	 */
	private String passportImg;
	/**
	 * 用户类型0=普通用户,1=系统用户
	 */
	private Integer userType;
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
