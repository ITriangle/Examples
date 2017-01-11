package com.wangl.annotation;

import java.lang.annotation.*;

/**
 * Created by seentech on 2017/1/11.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName {
    String value() default "";
}
