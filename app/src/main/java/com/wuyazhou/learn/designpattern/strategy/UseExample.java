package com.wuyazhou.learn.designpattern.strategy;

import com.wuyazhou.learn.designpattern.strategy.implement.CommonRivalStrategy;
import com.wuyazhou.learn.designpattern.strategy.implement.StrongRivalStrategy;
import com.wuyazhou.learn.designpattern.strategy.implement.WeakRivalStrategy;

/**
 * @author wuyzh
 * 使用实例
 * */
public class UseExample {
    public void use(){
        //遇上菜鸟使用的策略
        Context context = new Context(new WeakRivalStrategy());
        context.fight();

        //遇上一般对手使用的策略
        context = new Context(new CommonRivalStrategy());
        context.fight();

        //遇上高手使用的策略
        context = new Context(new StrongRivalStrategy());
        context.fight();
    }
}
