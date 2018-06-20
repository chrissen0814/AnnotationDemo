package com.chrissen.apt_api;

import android.app.Activity;

import java.lang.reflect.Constructor;

/**
 * Function:
 * <br/>
 * Describe:
 * <br/>
 * Author: chris on 2018/6/20.
 * <br/>
 * Email: sunqirui@jiuhuar.com
 */


public class Butter {

    public static void bind(Activity host){
        String classFullName = host.getClass().getName() + "$$ViewInjector";
        try {
            Class proxy = Class.forName(classFullName);
            Constructor constructor = proxy.getConstructor(host.getClass());
            constructor.newInstance(host);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
