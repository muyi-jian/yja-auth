package com.yj.model.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.yj.model.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Data;

@Data
@Tag(name = "用户角色")
@TableName("sys_user_role")
public class SysUserRole extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	@Schema(name = "角色id")
	@TableField("role_id")
	private String roleId;

	@Schema(name = "用户id")
	@TableField("user_id")
	private String userId;
}

