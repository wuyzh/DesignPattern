package com.wuyazhou.learn.designpattern.facade;

import com.wuyazhou.learn.logview.LogShowUtil;

/**
 * @author wuyzh
 * 子内功系统
 * */
public class NeiGongXiTong {
    public void jiuYangShenGong(){
        LogShowUtil.addLog("facade","使用九阳神功：",true);
    }

    public void qianKunDaNuoYi(){
        LogShowUtil.addLog("facade","使用乾坤大挪移：",true);
    }
}
