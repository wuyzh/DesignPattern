package com.wuyazhou.learn.designpattern.observe;

import com.wuyazhou.learn.logview.LogShowUtil;

/**
 * @author wuyzh
 * */
public class WinXinUser implements Observer{
    private String mName;
    public WinXinUser(String name){
        mName = name;
    }
    @Override
    public void update(String message) {
        LogShowUtil.addLog("observe",mName + "--" + message,true);
    }
}
