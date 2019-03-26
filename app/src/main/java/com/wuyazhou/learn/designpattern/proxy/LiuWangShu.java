package com.wuyazhou.learn.designpattern.proxy;

import com.wuyazhou.learn.logview.LogShowUtil;
/**
 * 真实购买者
 * */
public class LiuWangShu implements IShop{
    @Override
    public void buy(String thing) {
        LogShowUtil.addLog("proxy","找别人购买送回的东西："+thing,true);
    }
}
