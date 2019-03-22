package com.wuyazhou.learn.designpattern.singleton;
/**
 * @author wuyzh
 * 线程同步懒汉式
 * 1.能够在多线程中正常工作
 * 2.每次调用getInstance()都需要进行同步，造成不必要的同步开销
 * */
public class SynchronizedSingleton {
    private static SynchronizedSingleton mSynchronizedSingleton = null;

    private  SynchronizedSingleton(){

    }
    public static synchronized SynchronizedSingleton getInstance(){
        if (mSynchronizedSingleton == null){
            mSynchronizedSingleton = new SynchronizedSingleton();
        }
        return mSynchronizedSingleton;
    }
}
