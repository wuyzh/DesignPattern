package com.wuyazhou.learn.designpattern.singleton;
/**
 * @author wuyzh
 * 双重检索模式
 * 1.第一次加载时才会同步和实例化，效率高
 * 2.某些情况下会出现失效的问题
 * */
public class DCLSingleton {
    private static volatile DCLSingleton mDCLSingleton = null;
    private DCLSingleton(){

    }

    public static DCLSingleton getInstance(){
        if (mDCLSingleton == null) {
            synchronized (DCLSingleton.class){
                if (mDCLSingleton == null){
                    mDCLSingleton = new DCLSingleton();
                }
            }
        }
        return mDCLSingleton;
    }
}
