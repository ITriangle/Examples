package com.wangl.annotation;

import java.lang.annotation.*;

/**
 * Created by seentech on 2017/1/11.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitProvider {

    public int id() default -1;

    public String name() default "";

    public String address() default "";
}
