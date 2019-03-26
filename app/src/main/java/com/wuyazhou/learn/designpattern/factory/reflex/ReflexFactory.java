package com.wuyazhou.learn.designpattern.factory.reflex;

import com.wuyazhou.learn.designpattern.factory.Computer;

/**
 * @author wuyzh
 * */
public class ReflexFactory {
    public static <T extends Computer> T createComputer(Class<T> clz){
        Computer computer = null;
        String className = clz.getName();
        try {
            computer = (Computer) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) computer;
    }
}
