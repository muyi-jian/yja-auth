package com.yj.model.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.yj.model.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Data;

import java.util.List;

@Data
@Tag(name = "用户")
@TableName("sys_user")
public class SysUser extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	@Schema(name = "用户名")
	@TableField("username")
	private String username;

	@Schema(name = "密码")
	@TableField("password")
	private String password;

	@Schema(name = "姓名")
	@TableField("name")
	private String name;

	@Schema(name = "手机")
	@TableField("phone")
	private String phone;

	@Schema(name = "头像地址")
	@TableField("head_url")
	private String headUrl;

	@Schema(name = "部门id")
	@TableField("dept_id")
	private Long deptId;

	@Schema(name = "岗位id")
	@TableField("post_id")
	private Long postId;

	@Schema(name = "描述")
	@TableField("description")
	private String description;

	@Schema(name = "状态（1：正常 0：停用）")
	@TableField("status")
	private Integer status;

	@TableField(exist = false)
	private List<SysRole> roleList;
	//岗位
	@TableField(exist = false)
	private String postName;
	//部门
	@TableField(exist = false)
	private String deptName;
}

