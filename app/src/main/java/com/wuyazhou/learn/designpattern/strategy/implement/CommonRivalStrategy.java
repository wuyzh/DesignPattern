package com.wuyazhou.learn.designpattern.strategy.implement;

import com.wuyazhou.learn.designpattern.strategy.FightingStrategy;
import com.wuyazhou.learn.logview.LogShowUtil;

/**
 * @author wuyzh
 * 遇见一般对手的对付策略
 * */
public class CommonRivalStrategy implements FightingStrategy {
    @Override
    public void fight() {
        LogShowUtil.addLog("strategy","使用圣火令：",true);
    }
}
