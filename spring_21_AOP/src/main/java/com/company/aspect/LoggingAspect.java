package com.company.aspect;



import org.aspectj.lang.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class LoggingAspect {

    Logger logger = LoggerFactory.getLogger(LoggingAspect.class);


    @Pointcut("execution(* com.company.controller.CourseController.*(..))")   //Defining my joinPoint
    public void myPointcut(){}

    @Before("myPointcut()")
    public void log(){
        logger.info("Info log........");
    }

}
