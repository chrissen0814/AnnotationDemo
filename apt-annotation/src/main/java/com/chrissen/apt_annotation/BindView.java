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
 * Email: sunqirui@jiuhuar.com
 */

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.FIELD)
public @interface BindView {
    int value();
}
