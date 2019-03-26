package com.wuyazhou.learn.designpattern.proxy;

import com.wuyazhou.learn.designpattern.proxy.dynamicproxy.DynamicPurchasing;
import com.wuyazhou.learn.designpattern.proxy.staticproxy.HaErBinPurchasing;

import java.lang.reflect.Proxy;

/**
 * @author wuyzh
 * 使用实例
 * */
public class UseExample {
    public void staticProxy(){
        LiuWangShu liuWangShu = new LiuWangShu();
        HaErBinPurchasing haiErBinPurchasing = new HaErBinPurchasing(liuWangShu);
        haiErBinPurchasing.buy("人参");
    }

    public void useDynamicProxy(){
        LiuWangShu liuWangShu = new LiuWangShu();
        DynamicPurchasing dynamicPurchasing = new DynamicPurchasing(liuWangShu);

        ClassLoader classLoader = liuWangShu.getClass().getClassLoader();

        IShop iShop = (IShop) Proxy.newProxyInstance(classLoader,new Class[]{IShop.class},dynamicPurchasing);
        iShop.buy("鹿茸");
    }
}
