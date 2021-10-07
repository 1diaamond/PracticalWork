package com.alpha.model.utils;

import java.util.Arrays;
import java.util.List;

public class ParamsParser {
    public static List<String> parseParams(String stingBookParams){
        List<String> bookParams = Arrays.asList(stingBookParams.split(" "));
        return bookParams ;
    }


}
