package com.wuyazhou.learn.designpattern.decorate;

import com.wuyazhou.learn.logview.LogShowUtil;

/**
 * @author wuyzh
 *
 * */
public class YangGuo extends Swordsman{
    @Override
    public void attackMagic() {
        LogShowUtil.addLog("decorate","杨过自带全真剑法：",true);
    }
}
