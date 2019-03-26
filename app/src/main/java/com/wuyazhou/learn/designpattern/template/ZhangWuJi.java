package com.wuyazhou.learn.designpattern.template;

import com.wuyazhou.learn.logview.LogShowUtil;

/**
 * @author wuyzh
 * */
public class ZhangWuJi extends AbstractSwordman{
    @Override
    protected void neiGong() {
        LogShowUtil.addLog("template","使用内功九阳真经：",true);
    }

    @Override
    protected void weapons() {
        LogShowUtil.addLog("template","没有武器：",true);
    }

    @Override
    protected void zhaoShi() {
        LogShowUtil.addLog("template","使用招式乾坤大挪移：",true);
    }

    @Override
    protected boolean hasWeapons() {
        return false;
    }
}
