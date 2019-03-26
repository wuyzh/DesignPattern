package com.wuyazhou.learn.designpattern.decorate.decorator;

import com.wuyazhou.learn.designpattern.decorate.YangGuo;

/**
 * @author wuyzh
 * 使用实例
 * */
public class UseExample {
    public void use(){
        YangGuo yangGuo = new YangGuo();

        OuYangFeng ouYangFeng = new OuYangFeng(yangGuo);

        XiaoLongNv xiaoLongNv = new XiaoLongNv(ouYangFeng);

        xiaoLongNv.attackMagic();
    }
}
