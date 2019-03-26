package com.wuyazhou.learn.designpattern.facade;

import com.wuyazhou.learn.logview.LogShowUtil;

/**
 * @author wuyzh
 * 子招式系统
 * */
public class ZhaoShiXiTong {
    public void taJiJian(){
        LogShowUtil.addLog("facade","使用太极剑：",true);
    }
    public void qiShangQuan(){
        LogShowUtil.addLog("facade","使用七伤拳：",true);
    }
    public void shengHuoLing(){
        LogShowUtil.addLog("facade","使用圣火令：",true);
    }
}
