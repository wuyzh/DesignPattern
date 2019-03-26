package com.wuyazhou.learn.designpattern.proxy.dynamicproxy;

import com.wuyazhou.learn.logview.LogShowUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author wuyzh
 * 动态代理对象
 * */
public class DynamicPurchasing implements InvocationHandler {
    Object mObject;
    public DynamicPurchasing(Object object){
        this.mObject = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(proxy,args);
        if (method.getName().equals("buy")){
            LogShowUtil.addLog("proxy","买买买：",true);
        }
        return result;
    }
}
