package com.wuyazhou.learn.designpattern.observe;

/**
 * @author wuyzh
 * 使用实例
 * */
public class UseExample {
    public void use(){
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();

        //创建微信用户
        WinXinUser winXinUser1 = new WinXinUser("杨");
        WinXinUser winXinUser2 = new WinXinUser("月");
        WinXinUser winXinUser3 = new WinXinUser("轩");

        //订阅公众号
        subscriptionSubject.attach(winXinUser1);
        subscriptionSubject.attach(winXinUser2);
        subscriptionSubject.attach(winXinUser3);

        //公众号发消息给订阅者
        subscriptionSubject.notify("公众号更新了");
    }
}
