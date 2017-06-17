package me.tanwei.example.proxy.jdk;

import lombok.extern.slf4j.Slf4j;
import me.tanwei.example.proxy.bean.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by kelp on 2017/6/17.
 */
@Slf4j
public class HouseAgency implements InvocationHandler {
    private Person target;

    public HouseAgency(Person target) {
        this.target = target;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("中介开始查看{}的租房要求", this.target.getName());
        Object result = method.invoke(target, args);
        log.info("要求:{}", result);
        result = result + ",联系电话:xxx中介";
        log.info("中介查找房源");
        return result;
    }
}
