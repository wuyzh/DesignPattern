package com.wuyazhou.learn.designpattern.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wuyzh
 * */
public class SubscriptionSubject implements Subject {
    private List<Observer> mWeiXinUserList = new ArrayList<Observer>();
    @Override
    public void attach(Observer observer) {
        mWeiXinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        mWeiXinUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer:mWeiXinUserList){
            observer.update(message);
        }
    }
}
