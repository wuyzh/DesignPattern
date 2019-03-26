package com.wuyazhou.learn.designpattern.decorate.decorator;

import com.wuyazhou.learn.designpattern.decorate.Swordsman;
import com.wuyazhou.learn.logview.LogShowUtil;

/**
 * @author wuyzh
 * */
public class XiaoLongNv extends Master{

    public XiaoLongNv(Swordsman swordsman) {
        super(swordsman);
    }

    public void teach(){
        LogShowUtil.addLog("decorate","小龙女教玉女心经：",true);
        LogShowUtil.addLog("decorate","杨过学会玉女心经：",true);
    }
    @Override
    public void attackMagic() {
        super.attackMagic();
        teach();
    }
}
