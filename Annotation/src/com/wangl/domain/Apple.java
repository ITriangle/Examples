package com.wangl.domain;

import com.wangl.annotation.FruitColor;
import com.wangl.annotation.FruitName;
import com.wangl.annotation.FruitProvider;

/**
 * Created by seentech on 2017/1/11.
 */
public class Apple {

    @FruitName("Apple")
    private String appleNmae;

    @FruitColor(fruitColor = FruitColor.Color.RED)
    private String appleColor;

    @FruitProvider(id = 1, name = "陕西红富士集团", address = "陕西省西安市延安路89号红富士大厦")
    private String appleProvider;

    public String getAppleNmae() {
        return appleNmae;
    }

    public void setAppleNmae(String appleNmae) {
        this.appleNmae = appleNmae;
    }

    public String getAppleColor() {
        return appleColor;
    }

    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }

    public String getAppleProvider() {
        return appleProvider;
    }

    public void setAppleProvider(String appleProvider) {
        this.appleProvider = appleProvider;
    }
}
