package com.yj.system.exception;

import cpm.yj.common.result.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理
 *
 * @author yangjian
 * @version 1.0.0
 * @email 2628168756@qq.com
 * @date 2024/3/3 11:51
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 全局异常
     * @param e
     * @date  2024/3/3 11:52
     * @return Result
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e){
        e.printStackTrace();
        return Result.fail();
    }

    /**
     * 特定异常处理
     * @param null
     * @date  2024/3/3 11:53
     * @return null
     */
    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public Result error(ArithmeticException e){
        e.printStackTrace();
        return Result.fail().message("执行了特定异常处理");
    }
}
