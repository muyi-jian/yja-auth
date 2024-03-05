package com.yj.model.vo;


import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Data;

import java.util.List;

@Tag(name = "分配菜单")
@Data
public class AssginRoleVo {

    @Schema(name = "用户id")
    private String userId;

    @Schema(name = "角色id列表")
    private List<String> roleIdList;

}
