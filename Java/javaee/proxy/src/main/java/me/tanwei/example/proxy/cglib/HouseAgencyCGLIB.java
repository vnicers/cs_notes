package me.tanwei.example.proxy.cglib;

import lombok.extern.slf4j.Slf4j;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by kelp on 2017/6/17.
 */
@Slf4j
public class HouseAgencyCGLIB implements MethodInterceptor {
    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        log.info("CGLIB 方法执行之前");
        Object result = methodProxy.invokeSuper(o, objects);
        log.info(result.toString());
        log.info("CGLIB 方法执行之后");
        result=result+"xxxx";
        return result;
    }
}
