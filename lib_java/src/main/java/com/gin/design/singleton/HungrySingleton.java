package com.gin.design.singleton;

/**
 * Created by wang.lichen on 2017/7/5.
 * 二、恶汉,缺点：没有达到lazy loading的效果
 */

public class HungrySingleton {

    private static HungrySingleton singleton=new HungrySingleton();
    private HungrySingleton(){}
    public static HungrySingleton getInstance(){
        return singleton;
    }
}
