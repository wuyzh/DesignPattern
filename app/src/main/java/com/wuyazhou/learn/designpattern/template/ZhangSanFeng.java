package com.wuyazhou.learn.designpattern.template;

import com.wuyazhou.learn.logview.LogShowUtil;

/**
 * @author wuyzh
 * */
public class ZhangSanFeng extends AbstractSwordman{
    @Override
    protected void neiGong() {
        LogShowUtil.addLog("template","使用纯阳无极功：",true);
    }

    @Override
    protected void weapons() {
        LogShowUtil.addLog("template","没有真武剑：",true);
    }

    @Override
    protected void zhaoShi() {
        LogShowUtil.addLog("template","使用招式神门十三剑：",true);
    }

    @Override
    protected void hook() {
        LogShowUtil.addLog("template","年龄大了，突然肚子不舒服，去个厕所：",true);
    }
}
