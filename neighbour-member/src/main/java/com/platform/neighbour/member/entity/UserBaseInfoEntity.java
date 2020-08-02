package com.platform.neighbour.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户基本信息表
 * 
 * @author LiuChenggeng
 * @email liuchenggeng86@gmail.com
 * @date 2020-08-02 17:35:40
 */
@Data
@TableName("ums_user_base_info")
public class UserBaseInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String id;
	/**
	 * 用户登陆名
	 */
	private String username;
	/**
	 * 用户密码
	 */
	private String password;
	/**
	 * 性别
	 */
	private Integer gender;
	/**
	 * 生日
	 */
	private Date birthday;
	/**
	 * 注册时间
	 */
	private Date registerTime;
	/**
	 * 上次登陆时间
	 */
	private Date lastLoginTime;
	/**
	 * 上次登陆IP
	 */
	private String lastLoginIp;
	/**
	 * 用户级别ID
	 */
	private Integer userLevelId;
	/**
	 * 昵称
	 */
	private String nickname;
	/**
	 * 移动电话
	 */
	private String mobile;
	/**
	 * 注册IP
	 */
	private String registerIp;
	/**
	 * 头像
	 */
	private String avatar;
	/**
	 * 微信OpenID
	 */
	private String weixinOpenid;
	/**
	 * 微信UnionID
	 */
	private String weixinUnionId;
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
