package com.chrissen.apt_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Function:
 * <br/>
 * Describe:
 * <br/>
 * Author: chris on 2018/6/20.
 * <br/>
 * Email: chrissen0814@gmail.com
 */
//保留策略（SOURCE,CLASS,RUNTIME）
@Retention(RetentionPolicy.CLASS)
//作用域
@Target(ElementType.FIELD)
public @interface BindView {
    //注解中的值为int类型
    int value();
}
