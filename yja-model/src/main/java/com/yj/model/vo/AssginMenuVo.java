package com.yj.model.vo;


import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Data;

import java.util.List;

@Tag(name = "分配菜单")
@Data
public class AssginMenuVo {

    @Schema(name = "角色id")
    private String roleId;

    @Schema(name = "菜单id列表")
    private List<String> menuIdList;

}
