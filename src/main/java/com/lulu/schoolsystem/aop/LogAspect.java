package com.lulu.schoolsystem.aop;


import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/** @author:  v_chenyongshuai@:
  * @date:  2018年9月7日 上午11:05:34 
  * @version：   1.0.0
  * @describe:    
  */
@Aspect  
@Component 
public class LogAspect {
	
	private final static Logger logger = Logger.getLogger(LogAspect.class);
	
	@Pointcut("execution(public * com.lulu.schoolsystem.dao.*.*(..))")  
    public void webLog(){}  
	
	@Before("webLog()")  
    public void deBefore(JoinPoint joinPoint) throws Throwable {  
		//System.out.println("前置start.....");  
        // 接收到请求，记录请求内容  
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();  
        HttpServletRequest request = attributes.getRequest();  
        // 记录下请求内容  
        /*System.out.println("URL : " + request.getRequestURL().toString());  
        System.out.println("HTTP_METHOD : " + request.getMethod());  
        System.out.println("IP : " + request.getRemoteAddr());  
        System.out.println("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());  
        System.out.println("ARGS : " + Arrays.toString(joinPoint.getArgs()));  */
        
        logger.debug(request.getRequestURL().toString()+" "+request.getMethod()+" "+" "+request.getRemoteAddr()+" "+joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName()+" "+Arrays.toString(joinPoint.getArgs()));
        //System.out.println("前置end.....");  
    }  
	
	@AfterReturning(returning = "ret", pointcut = "webLog()")  
    public void doAfterReturning(Object ret) throws Throwable {  
        // 处理完请求，返回内容  
        //System.out.println("方法的返回值 : " + ret);  
    }  
	
	//后置异常通知  
    @AfterThrowing("webLog()")  
    public void throwss(JoinPoint jp){  
        //System.out.println("方法异常时执行.....");  
    }  
	
    //后置最终通知,final增强，不管是抛出异常或者正常退出都会执行  
    @After("webLog()")  
    public void after(JoinPoint jp){  
        //System.out.println("后置Start.....");  
        //System.out.println("后置end.....");  
    }  
	
  //环绕通知,环绕增强，相当于MethodInterceptor  
    @Around("webLog()")  
    public Object arround(ProceedingJoinPoint pjp) {  
        //System.out.println("环绕start.....");  
        try {
        	Object o =  pjp.proceed();
            //System.out.println("CLASS_METHOD : " + pjp.getSignature().getDeclaringTypeName() + "." + pjp.getSignature().getName());  
            //String className = pjp.getSignature().getDeclaringTypeName();
            //String methodName = pjp.getSignature().getName();
            //System.out.println("方法环绕proceed，结果是 :" + o);
            //System.out.println("环绕end.....");  
            return o;
        } catch (Throwable e) {  
            e.printStackTrace();  
            return null;  
        }  
    }  
	
}
