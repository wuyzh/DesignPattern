package com.wuyazhou.learn.designpattern.observe;
/**
 * @author wuyzh
 * */
public interface Observer {
    /**
     * 更新
     * @param message 消息内容
     * */
    void update(String message);
}
