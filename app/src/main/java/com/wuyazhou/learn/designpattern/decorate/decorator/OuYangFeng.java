package com.wuyazhou.learn.designpattern.decorate.decorator;

import com.wuyazhou.learn.designpattern.decorate.Swordsman;
import com.wuyazhou.learn.logview.LogShowUtil;

/**
 * @author wuyzh
 * */
public class OuYangFeng extends Master{
    public OuYangFeng(Swordsman swordsman) {
        super(swordsman);
    }

    private void teach() {
        LogShowUtil.addLog("decorate","欧阳锋教蛤蟆功：",true);
        LogShowUtil.addLog("decorate","杨过学会蛤蟆功：",true);
    }

    @Override
    public void attackMagic() {
        super.attackMagic();
        teach();
    }
}
