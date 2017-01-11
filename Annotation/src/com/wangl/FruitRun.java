package com.wangl;

import com.wangl.annotation.FruitInfoUtil;
import com.wangl.domain.Apple;

/**
 * Created by seentech on 2017/1/11.
 */
public class FruitRun {
    public static void main(String[] args){
        /**
         * 获取Apple.class 类的基本信息
         */
        FruitInfoUtil.getFruitInfo(Apple.class);
    }
}
