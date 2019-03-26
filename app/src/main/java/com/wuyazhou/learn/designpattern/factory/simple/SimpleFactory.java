package com.wuyazhou.learn.designpattern.factory.simple;

import com.wuyazhou.learn.designpattern.factory.Computer;
import com.wuyazhou.learn.designpattern.factory.HuaShuComputer;
import com.wuyazhou.learn.designpattern.factory.HuiPuComputer;
import com.wuyazhou.learn.designpattern.factory.LenovoComputer;

/**
 * @author wuyzh
 * */
public class SimpleFactory {

    public static Computer createComputer(String type){
        Computer computer = null;
        switch (type){
            case "lenovo":
                computer = new LenovoComputer();
                break;
            case "huiPu":
                computer = new HuiPuComputer();
                break;
            case "huaShu":
                computer = new HuaShuComputer();
                break;
        }
        return computer;
    }




}
