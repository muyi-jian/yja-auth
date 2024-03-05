package com.yj.model.captcha;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yangjian
 * @version 1.0.0
 * @email 2628168756@qq.com
 * @date 2024/3/4 23:06
 */
@Schema(description ="验证码响应对象")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CaptchaResult {

    @Schema(description = "验证码缓存key")
    private String captchaKey;

    @Schema(description = "验证码图片Base64字符串")
    private String captchaBase64;
}
