package com.yj.system.exception;

import cpm.yj.common.result.ResultCodeEnum;
import lombok.Data;

/**
 * yja异常处理
 *
 * @author yangjian
 * @version 1.0.0
 * @email 2628168756@qq.com
 * @date 2024/3/3 11:54
 */
@Data
public class YjaException extends RuntimeException{
    private Integer code;

    private String message;

    /**
     * 通过状态码和错误消息创建异常对象
     * @param code
     * @param message
     */
    public YjaException(Integer code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    /**
     * 接收枚举类型对象
     * @param resultCodeEnum
     */
    public YjaException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
        this.message = resultCodeEnum.getMessage();
    }

    @Override
    public String toString() {
        return "YjaException{" +
                "code=" + code +
                ", message=" + this.getMessage() +
                '}';
    }
}
