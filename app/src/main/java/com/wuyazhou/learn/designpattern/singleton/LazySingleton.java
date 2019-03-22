package com.wuyazhou.learn.designpattern.singleton;
/**
 * @author wuyzh
 * 饿汉式
 * 1.第一次加载时需要实例化，反应稍慢一些
 * 2.多线程时不能正常工作
 * */
public class LazySingleton {
    private static LazySingleton mLazySingleton = null;
    private LazySingleton(){

    }
    public static LazySingleton getInstance(){
        if (mLazySingleton == null){
            mLazySingleton = new LazySingleton();
        }
        return mLazySingleton;
    }
}
