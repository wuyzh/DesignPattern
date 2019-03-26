package com.wuyazhou.learn.designpattern.strategy.implement;

import com.wuyazhou.learn.designpattern.strategy.FightingStrategy;
import com.wuyazhou.learn.logview.LogShowUtil;

/**
 * @author wuyzh
 * 遇见强对手的对付策略
 * */
public class StrongRivalStrategy implements FightingStrategy {
    @Override
    public void fight() {
        LogShowUtil.addLog("strategy","使用乾坤大挪移：",true);
    }
}
