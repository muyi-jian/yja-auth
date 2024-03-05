package com.yj.model.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.yj.model.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Data;

@Data
@Tag(name = "角色菜单")
@TableName("sys_role_menu")
public class SysRoleMenu extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	@Schema(name = "角色id")
	@TableField("role_id")
	private String roleId;

	@Schema(name = "菜单id")
	@TableField("menu_id")
	private String menuId;

}

