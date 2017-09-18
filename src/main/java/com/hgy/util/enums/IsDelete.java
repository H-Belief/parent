package com.hgy.util.enums;

/**
 * Created by huguoyu on 2017/9/18.
 */
public enum IsDelete {
    DEFAULT(0),
    DELETE(1);
    private final int value;
    public int getValue(){
        return value;
    }
    IsDelete(int value){
        this.value = value;
    }
}
