package com.yj.system.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yj.model.system.SysRole;
import com.yj.model.vo.SysRoleQueryVo;
import com.yj.system.service.SysRoleService;
import cpm.yj.common.result.Result;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author yangjian
 * @version 1.0.0
 * @email 2628168756@qq.com
 * @date 2024/3/3 8:51
 */
@Tag(name = "角色管理接口")
@RestController
@RequestMapping("/admin/system/sysRole")
public class SysRoleController {
    @Autowired
    private SysRoleService sysRoleService;

    /**
     * 查询所有
     * @param
     * @date  2024/3/3 9:04
     * @return List<SysRole>
     */
    @Schema(name = "查询所有角色接口")
    @GetMapping("/findAll")
    public Result findAllRole(){
        List<SysRole> list = sysRoleService.list();
        return Result.ok(list);
    }

    /**
     * 分页查询
     * @param page 当前页
     * @param limit 每页记录数
     * @date  2024/3/3 10:49
     * @return null
     */
    @Schema(name = "分页查询角色接口")
    @GetMapping("/findPageQuery/{page}/{limit}")
    public Result findPageQueryRole(@PathVariable Long page,
                                    @PathVariable Long limit,
                                    SysRoleQueryVo sysRoleQueryVo){
        System.out.println("sysRoleQueryVo::"+sysRoleQueryVo.getRoleName());
        // 创建page对象
        Page<SysRole> pageParam = new Page<>(page,limit);
        // 调用service
        IPage<SysRole> pageModel = sysRoleService.selectPage(pageParam, sysRoleQueryVo);
        return Result.ok(pageModel);
    }
    /**
     * 逻辑删除接口
     * @param id
     * @date  2024/3/3 9:06
     * @return boolean
     */
    @Schema(name = "逻辑删除接口")
    @DeleteMapping("/remove/{id}")
    public Result removeRoleById(@PathVariable Long id){
        boolean isSuccess = sysRoleService.removeById(id);
        if (isSuccess){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }
    /**
     * 添加角色接口
     * @param sysRole sysRole
     * @date  2024/3/3 9:06
     * @return boolean
     */
    @Schema(name = "添加角色接口")
    @PostMapping("/save")
    public Result saveRole(@RequestBody SysRole sysRole){
        boolean isSuccess = sysRoleService.save(sysRole);
        if (isSuccess){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }
    /**
     * 根据id查询接口
     * @param id
     * @date  2024/3/3 9:06
     * @return boolean
     */
    @Schema(name = "根据id查询接口")
    @GetMapping("/findRoleById/{id}")
    public Result findRoleById(@PathVariable Long id){
       SysRole sysRole = sysRoleService.getById(id);
        return Result.ok(sysRole);
    }
    /**
     * 更新角色接口
     * @param sysRole sysRole
     * @date  2024/3/3 9:06
     * @return boolean
     */
    @Schema(name = "更新角色接口")
    @PutMapping("/update")
    public Result updateRole(@RequestBody SysRole sysRole){
        boolean isSuccess = sysRoleService.updateById(sysRole);
        if (isSuccess){
            return Result.ok();
        }else{
            return Result.fail();
        }
    }

    /**
     * 批量删除
     * @param idList
     * @date  2024/3/3 11:45
     * @return Result
     */
    @Schema(name = "根据id列表删除")
    @DeleteMapping("/batchRemove")
    public Result batchRemove(@RequestBody List<Long> idList) {
        sysRoleService.removeByIds(idList);
        return Result.ok();
    }
}
