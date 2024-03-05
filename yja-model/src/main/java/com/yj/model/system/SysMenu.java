package com.yj.model.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.yj.model.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Data;

import java.util.List;

@Data
@Tag(name = "菜单")
@TableName("sys_menu")
public class SysMenu extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	@Schema(name = "所属上级")
	@TableField("parent_id")
	private Long parentId;

	@Schema(name = "名称")
	@TableField("name")
	private String name;

	@Schema(name = "类型(1:菜单,2:按钮)")
	@TableField("type")
	private Integer type;

	@Schema(name = "路由地址")
	@TableField("path")
	private String path;

	@Schema(name = "组件路径")
	@TableField("component")
	private String component;

	@Schema(name = "权限标识")
	@TableField("perms")
	private String perms;

	@Schema(name = "图标")
	@TableField("icon")
	private String icon;

	@Schema(name = "排序")
	@TableField("sort_value")
	private Integer sortValue;

	@Schema(name = "状态(0:禁止,1:正常)")
	@TableField("status")
	private Integer status;

	// 下级列表
	@TableField(exist = false)
	private List<SysMenu> children;
	//是否选中
	@TableField(exist = false)
	private boolean isSelect;
}

