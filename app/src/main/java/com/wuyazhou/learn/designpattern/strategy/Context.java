package com.wuyazhou.learn.designpattern.strategy;
/**
 * @author wuyzh
 * 上下文角色
 * */
public class Context {
    private FightingStrategy mFightingStrategy;
    public Context(FightingStrategy fightingStrategy){
        mFightingStrategy = fightingStrategy;
    }
    public void fight(){
        mFightingStrategy.fight();
    }
}
