package com.yj.model.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.yj.model.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Data;

import java.util.Date;

@Data
@Tag(name = "SysLoginLog")
@TableName("sys_login_log")
public class SysLoginLog extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Schema(name = "用户账号")
	@TableField("username")
	private String username;

	@Schema(name = "登录IP地址")
	@TableField("ipaddr")
	private String ipaddr;

	@Schema(name = "登录状态（0成功 1失败）")
	@TableField("status")
	private Integer status;

	@Schema(name = "提示信息")
	@TableField("msg")
	private String msg;

	@Schema(name = "访问时间")
	@TableField("access_time")
	private Date accessTime;

}