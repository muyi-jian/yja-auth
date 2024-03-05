package com.yj.system.service.impl;

import cn.hutool.captcha.AbstractCaptcha;
import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.generator.CodeGenerator;
import cn.hutool.core.util.IdUtil;
import com.yj.model.captcha.CaptchaResult;
import com.yj.system.captcha.CaptchaProperties;
import com.yj.system.service.IndexService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.awt.*;

/**
 * @author yangjian
 * @version 1.0.0
 * @email 2628168756@qq.com
 * @date 2024/3/4 22:39
 */
@Service
@RequiredArgsConstructor
public class IndexServiceImpl implements IndexService {
    private final CodeGenerator codeGenerator;
    private final Font captchaFont;
    private final CaptchaProperties captchaProperties;
    /**
     * 获取验证码
     *
     * @return 验证码
     */
    @Override
    public CaptchaResult getCaptcha() {

        String type = captchaProperties.getType();
        int width = captchaProperties.getWidth();
        int height = captchaProperties.getHeight();
        int interfereCount = captchaProperties.getInterfereCount();
        int codeLength = captchaProperties.getCode().getLength();

        AbstractCaptcha captcha;
        if ("circle".equalsIgnoreCase(type)) {
            captcha = CaptchaUtil.createCircleCaptcha(width, height, codeLength, interfereCount);
        } else if ("gif".equalsIgnoreCase(type)) {
            captcha = CaptchaUtil.createGifCaptcha(width, height, codeLength);
        } else if ("line".equalsIgnoreCase(type)) {
            captcha = CaptchaUtil.createLineCaptcha(width, height, codeLength, interfereCount);
        } else if ("shear".equalsIgnoreCase(type)) {
            captcha = CaptchaUtil.createShearCaptcha(width, height, codeLength, interfereCount);
        } else {
            throw new IllegalArgumentException("Invalid captcha type: " + type);
        }
        captcha.setGenerator(codeGenerator);
        captcha.setTextAlpha(captchaProperties.getTextAlpha());
        captcha.setFont(captchaFont);

        String captchaCode = captcha.getCode();
        String imageBase64Data = captcha.getImageBase64Data();

        // 验证码文本缓存至Redis，用于登录校验
        String captchaKey = IdUtil.fastSimpleUUID();
        // redisTemplate.opsForValue().set(CacheConstants.CAPTCHA_CODE_PREFIX + captchaKey,captchaCode,
        //         captchaProperties.getExpireSeconds(), TimeUnit.SECONDS);

        return CaptchaResult.builder()
                .captchaKey(captchaKey)
                .captchaBase64(imageBase64Data)
                .build();

    }
}
