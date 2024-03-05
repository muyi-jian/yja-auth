package com.yj.model.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.yj.model.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Data;

import java.util.Date;

@Data
@Tag(name = "SysOperLog")
@TableName("sys_oper_log")
public class SysOperLog extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Schema(name = "模块标题")
	@TableField("title")
	private String title;

	@Schema(name = "业务类型（0其它 1新增 2修改 3删除）")
	@TableField("business_type")
	private String businessType;

	@Schema(name = "方法名称")
	@TableField("method")
	private String method;

	@Schema(name = "请求方式")
	@TableField("request_method")
	private String requestMethod;

	@Schema(name = "操作类别（0其它 1后台用户 2手机端用户）")
	@TableField("operator_type")
	private String operatorType;

	@Schema(name = "操作人员")
	@TableField("oper_name")
	private String operName;

	@Schema(name = "部门名称")
	@TableField("dept_name")
	private String deptName;

	@Schema(name = "请求URL")
	@TableField("oper_url")
	private String operUrl;

	@Schema(name = "主机地址")
	@TableField("oper_ip")
	private String operIp;

	@Schema(name = "请求参数")
	@TableField("oper_param")
	private String operParam;

	@Schema(name = "返回参数")
	@TableField("json_result")
	private String jsonResult;

	@Schema(name = "操作状态（0正常 1异常）")
	@TableField("status")
	private Integer status;

	@Schema(name = "错误消息")
	@TableField("error_msg")
	private String errorMsg;

	@Schema(name = "操作时间")
	@TableField("oper_time")
	private Date operTime;

}