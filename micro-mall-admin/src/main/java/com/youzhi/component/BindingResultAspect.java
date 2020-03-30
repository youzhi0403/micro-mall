package com.youzhi.component;

import com.youzhi.dto.CommonResult;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

/**
 * @author youzhi
 * @date 2020/3/28 9:38
 * validate错误处理切面
 */
@Aspect
@Component
@Order(2)
public class BindingResultAspect {
    private final Logger LOGGER = LoggerFactory.getLogger(BindingResultAspect.class);

    @Pointcut("execution(public * com.youzhi.controller.*.*(..))")
    public void BindingResult() {
    }

    @Around("BindingResult()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            if (arg instanceof BindingResult) {
                BindingResult result = (BindingResult) arg;
                if (result.hasErrors()) {
                    LOGGER.info("{}",result.getFieldError());
                    return new CommonResult().validateFailed(result);
                }
            }
        }
        return joinPoint.proceed();
    }

}
