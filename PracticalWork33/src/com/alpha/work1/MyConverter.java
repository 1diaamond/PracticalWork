package com.alpha.work1;

public interface MyConverter {
    void convertStr(String str);
    static boolean isNull (String str){
        return str == null;
    }
}