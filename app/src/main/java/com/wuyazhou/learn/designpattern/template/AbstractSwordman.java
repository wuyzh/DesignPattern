package com.wuyazhou.learn.designpattern.template;

import com.wuyazhou.learn.logview.LogShowUtil;

/**
 * @author wuyzh
 * */
public abstract class AbstractSwordman {
    /**
     * 方法写为final,防止算法框架给复写
     * */
    public final void fight(){
        //运行内功，抽象方法
        neiGong();
        //开启经脉，具体方法
        jingMai();
        //如果有武器则准备武器
        if (hasWeapons()){
            //准备武器
            weapons();
        }
        //使用招式
        zhaoShi();
        //钩子方法
        hook();
    }

    protected void hook(){}

    /**
     * 使用内功
     * */
    protected abstract void neiGong();

    /**
     * 使用武器
     * */
    protected abstract void weapons();

    /**
     * 使用招式
     * */
    protected abstract void zhaoShi();

    /**
     * 开启经脉
     * */
    protected void jingMai(){
        LogShowUtil.addLog("template","使用太极剑：",true);
    }

    /**
     * 判断是否有武器，默认有武器
     * */
    protected boolean hasWeapons(){
        return true;
    }
}
