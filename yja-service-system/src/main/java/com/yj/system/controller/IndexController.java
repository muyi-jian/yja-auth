package com.yj.system.controller;

import com.yj.model.captcha.CaptchaResult;
import com.yj.system.service.IndexService;
import cpm.yj.common.result.Result;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 后台登录登出
 *
 * @author yangjian
 * @version 1.0.0
 * @email 2628168756@qq.com
 * @date 2024/3/4 21:38
 */
@Tag(name = "后台登录登出")
@RestController
@RequestMapping("/admin/system/index")
public class IndexController {
    @Autowired
    private IndexService indexService;
    /**
     * 登录
     * @return
     */
    @PostMapping("/login")
    public Result login() {
        Map<String, Object> map = new HashMap<>();
        map.put("token","admin");
        return Result.ok(map);
    }
    /**
     * 获取用户信息
     * @return
     */
    @GetMapping("/info")
    public Result info() {
        Map<String, Object> map = new HashMap<>();
        map.put("roles","[admin]");
        map.put("name","admin");
        map.put("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        return Result.ok(map);
    }
    /**
     * 退出
     * @return
     */
    @DeleteMapping("/logout")
    public Result logout(){
        return Result.ok();
    }
    /**
     * 获取验证码
     * @param
     * @date  2024/3/4 22:17
     * @return Result
     */
    @GetMapping("/auth/captcha")
    public Result get(){
        CaptchaResult captcha = indexService.getCaptcha();
          return Result.ok(captcha);
    }
}
