package com.chrissen.apt_compiler;

import javax.lang.model.element.VariableElement;

/**
 * Function:
 * <br/>
 * Describe:
 * <br/>
 * Author: chris on 2018/6/19.
 * <br/>
 * Email: sunqirui@jiuhuar.com
 */


public class VariableInfo {
    private int mViewId;
    private VariableElement mVariableElement;


    public VariableInfo() {
    }

    public VariableInfo(int viewId, VariableElement variableElement) {
        mViewId = viewId;
        mVariableElement = variableElement;
    }

    public int getViewId() {
        return mViewId;
    }

    public void setViewId(int viewId) {
        mViewId = viewId;
    }

    public VariableElement getVariableElement() {
        return mVariableElement;
    }

    public void setVariableElement(VariableElement variableElement) {
        mVariableElement = variableElement;
    }
}
