package com.wuyazhou.learn.designpattern.decorate.decorator;

import com.wuyazhou.learn.designpattern.decorate.Swordsman;

/**
 * @author wuyzh
 * 师傅
 * */
public class Master extends Swordsman {
    Swordsman mSwordsman;
    public Master(Swordsman swordsman){
        mSwordsman = swordsman;
    }
    @Override
    public void attackMagic() {
        mSwordsman.attackMagic();
    }
}
