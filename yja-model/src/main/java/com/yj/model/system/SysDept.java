package com.yj.model.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.yj.model.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Data;

import java.util.List;

@Data
@Tag(name = "部门")
@TableName("sys_dept")
public class SysDept extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Schema(name = "部门名称")
	@TableField("name")
	private String name;

	@Schema(name = "上级部门id")
	@TableField("parent_id")
	private Long parentId;

	@Schema(name = "树结构")
	@TableField("tree_path")
	private String treePath;

	@Schema(name = "排序")
	@TableField("sort_value")
	private Integer sortValue;

	@Schema(name = "负责人")
	@TableField("leader")
	private String leader;

	@Schema(name = "电话")
	@TableField("phone")
	private String phone;

	@Schema(name = "状态（1正常 0停用）")
	@TableField("status")
	private Integer status;

	@Schema(name = "下级部门")
	@TableField(exist = false)
	private List<SysDept> children;

}