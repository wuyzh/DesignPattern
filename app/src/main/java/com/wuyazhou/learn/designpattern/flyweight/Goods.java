package com.wuyazhou.learn.designpattern.flyweight;

import com.wuyazhou.learn.logview.LogShowUtil;

/**
 * @author wuyzh
 * */
public class Goods implements IGoods {
    private String mName;
    public Goods(String name){
        mName = name;
    }
    @Override
    public void showGoodsPrice(String version) {
        if ("32G".equals(version)){
            LogShowUtil.addLog("flyweight","32G "+mName+" 价格为：5199元",true);
        }else if ("128G".equals(version)){
            LogShowUtil.addLog("flyweight","128G "+mName+" 价格为：5999元",true);
        }
    }
}
