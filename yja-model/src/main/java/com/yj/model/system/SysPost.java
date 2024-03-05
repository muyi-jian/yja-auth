package com.yj.model.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.yj.model.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Data;

@Data
@Tag(name = "岗位")
@TableName("sys_post")
public class SysPost extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Schema(name = "岗位编码")
	@TableField("post_code")
	private String postCode;

	@Schema(name = "岗位名称")
	@TableField("name")
	private String name;

	@Schema(name = "显示顺序")
	@TableField("description")
	private String description;

	@Schema(name = "状态（1正常 0停用）")
	@TableField("status")
	private Integer status;

}