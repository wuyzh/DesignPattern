package com.wuyazhou.learn.designpattern.flyweight;

/**
 * @author wuyzh
 * 使用实例
 * */
public class UseExample {
    public void use(){
        Goods goods1 = GoodsFactory.getGoods("iphone7");
        goods1.showGoodsPrice("32G");

        Goods goods2 = GoodsFactory.getGoods("iphone7");
        goods2.showGoodsPrice("32G");

        Goods goods3 = GoodsFactory.getGoods("iphone7");
        goods3.showGoodsPrice("128G");
    }
}
