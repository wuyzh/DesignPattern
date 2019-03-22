package com.wuyazhou.learn.designpattern.singleton;
/**
 * @author wuyzh
 * 静态内部类单例
 * 1.加载StaticInnerSingleton类时不会初始化mInstance
 * 2.第一次调用getInsatnce时，虚拟机加载StaticInnerSingletonHolder 并初始化mInstance
 * 3.能确保线程安全也能保证单例唯一
 * */
public class StaticInnerSingleton {
    private StaticInnerSingleton(){

    }

    public static StaticInnerSingleton getInstance(){
        return StaticInnerSingletonHolder.mInstance;
    }

    private static class StaticInnerSingletonHolder{
        private static final StaticInnerSingleton mInstance = new StaticInnerSingleton();
    }
}
