package com.wuyazhou.learn.designpattern.proxy.staticproxy;

import com.wuyazhou.learn.designpattern.proxy.IShop;

/**
 * @author wuyzh
 * 哈尔滨代理购买人
 * */
public class HaErBinPurchasing implements IShop {
    private IShop iShop;
    public HaErBinPurchasing(IShop iShop){
        this.iShop = iShop;
    }
    @Override
    public void buy(String thing) {
        iShop.buy(thing);
    }
}
