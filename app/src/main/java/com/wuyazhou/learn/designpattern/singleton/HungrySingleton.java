package com.wuyazhou.learn.designpattern.singleton;
/**
 * @author wuyzh
 * 饿汉式
 * 1.类加载时就完成了初始化，所以类加载比较慢
 * 2.基于类加载机制，避免了多线程的同步问题
 * 3.如果自始至终没使用的话会造成内存的浪费
 * */
public class HungrySingleton {
    private static HungrySingleton mHungrySingleton = new HungrySingleton();
    private HungrySingleton(){

    }
    public static HungrySingleton getInstance(){
        return mHungrySingleton;
    }
}
