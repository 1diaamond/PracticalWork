package com.alpha.task3;

import java.util.HashMap;
import java.util.Map;

public class MyTranslator {
    Map <String,String> wordsPairs;

    public MyTranslator() {
        this.wordsPairs = new HashMap<>();
    }
    public void addWords(String englishWord, String RussianWord){
       if (englishWord != null && RussianWord != null){
        wordsPairs.put(englishWord.trim(), RussianWord.trim());}
    }

    public String translate(String englishWord){
        if (englishWord != null && wordsPairs.containsKey(englishWord))
        return wordsPairs.get(englishWord);
        else return "We have no such word";
    }
}
