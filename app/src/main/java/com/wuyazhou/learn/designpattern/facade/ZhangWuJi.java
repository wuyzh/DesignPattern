package com.wuyazhou.learn.designpattern.facade;
/**
 * 外观类
 * */
public class ZhangWuJi {
    private JingMaiXiTong mJingMaiXiTong;
    private NeiGongXiTong mNeiGongXiTong;
    private ZhaoShiXiTong mZhaoShiXiTong;

    public ZhangWuJi(){
        mJingMaiXiTong = new JingMaiXiTong();
        mNeiGongXiTong = new NeiGongXiTong();
        mZhaoShiXiTong = new ZhaoShiXiTong();
    }

    /**
     * 使用乾坤大挪移
     * */
    public void qianKun(){
        mJingMaiXiTong.kaiQiJingMai();
        mNeiGongXiTong.qianKunDaNuoYi();
    }

    /**
     * 使用七伤拳
     * */
    public void qiShangQuan(){
        mJingMaiXiTong.kaiQiJingMai();
        mNeiGongXiTong.jiuYangShenGong();
        mZhaoShiXiTong.qiShangQuan();
    }

}
