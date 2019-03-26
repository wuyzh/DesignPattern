package com.wuyazhou.learn.designpattern.template;

/**
 * @author wuyzh
 * 使用实例
 * */
public class UseExample {
    public void use(){
        //张无忌干架过程
        ZhangWuJi zhangWuJi = new ZhangWuJi();
        zhangWuJi.fight();
        //张三丰干架过程
        ZhangSanFeng zhangSanFeng = new ZhangSanFeng();
        zhangSanFeng.fight();
    }
}
