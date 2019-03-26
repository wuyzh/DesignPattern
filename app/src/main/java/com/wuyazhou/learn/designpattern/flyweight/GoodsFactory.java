package com.wuyazhou.learn.designpattern.flyweight;

import com.wuyazhou.learn.logview.LogShowUtil;

import java.util.HashMap;
import java.util.Map;
/**
 * @author wuyzh
 * 商品工厂
 * */
public class GoodsFactory {
    private static Map<String,Goods> pool = new HashMap<String, Goods>();
    public static Goods getGoods(String name){
        if (pool.containsKey(name)){
            LogShowUtil.addLog("flyweight","使用缓存",true);
            return pool.get(name);
        }else {
            LogShowUtil.addLog("flyweight","创建商品并返回",true);
            Goods goods = new Goods(name);
            pool.put(name,goods);
            return goods;
        }
    }
}
