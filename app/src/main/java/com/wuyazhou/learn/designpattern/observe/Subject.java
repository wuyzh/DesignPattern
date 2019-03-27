package com.wuyazhou.learn.designpattern.observe;
/**
 * @author wuyzh
 * */
public interface Subject {
    /**
     * 添加订阅者
     * @param observer
     * */
    void attach(Observer observer);

    /**
     * 删除订阅者
     * @param observer
     * */
    void detach(Observer observer);
    /**
     * 通知处理
     * @param message
     * */
    void notify(String message);
}
