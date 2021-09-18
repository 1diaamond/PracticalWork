package com.alpha.work1;

public interface MyConverter {
    String convertStr(String str);
    static boolean isNull (String str){
        return str == null ? true : str.trim() == "" ? true : false;
    }
}