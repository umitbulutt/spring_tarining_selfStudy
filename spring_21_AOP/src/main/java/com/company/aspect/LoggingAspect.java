package com.company.aspect;



import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class LoggingAspect {

    Logger logger = LoggerFactory.getLogger(LoggingAspect.class);


 //   @Pointcut("execution(* com.company.controller.CourseController.*(..))")   //Defining my joinPoint
 //   public void myPointcut(){}
//
 //   @Before("myPointcut()")
 //   public void log(){
 //       logger.info("Info log........");
 //   }
//

//    @Before("execution(* com.company.controller.CourseController.*(..))")   //Defining my joinPoint
//    public void log(){
//        logger.info("Info log.................");
//    }

    @Pointcut("execution(* com.company.repository.CourseRepository.findById(*))")
    public void courseRepositoryFindByIdPC(){}


    @Before("courseRepositoryFindByIdPC()")
    public void beforeFindCourseRepositoryById(JoinPoint joinPoint){  //JoinPoint are the method we wanted to implement before or after
        logger.info("Before : Method: {},Arguments: {}, Target: {}"
                , joinPoint.getSignature(), joinPoint.getArgs(),joinPoint.getTarget());
    }

}
