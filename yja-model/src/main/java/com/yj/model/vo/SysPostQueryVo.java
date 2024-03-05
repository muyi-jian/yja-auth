package com.yj.model.vo;

import lombok.Data;

@Data
public class SysPostQueryVo {
	
	//@Schema(name = "岗位编码")
	private String postCode;

	//@Schema(name = "岗位名称")
	private String name;

	//@Schema(name = "状态（1正常 0停用）")
	private Boolean status;


}

