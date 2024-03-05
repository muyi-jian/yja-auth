package com.yj.system.service;

import com.yj.model.captcha.CaptchaResult;

/**
 * @author yangjian
 * @version 1.0.0
 * @email 2628168756@qq.com
 * @date 2024/3/4 22:39
 */
public interface IndexService {
    /**
     * 获取验证码
     *
     * @return 验证码
     */
    CaptchaResult getCaptcha();
}
