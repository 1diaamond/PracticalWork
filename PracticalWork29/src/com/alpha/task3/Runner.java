package com.alpha.task3;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    public void run() {
        MyTranslator myTranslator = new MyTranslator();
        myTranslator.addWords("cat","кошка");
        myTranslator.addWords("dog","собака");
        myTranslator.addWords("avakov","черт");
        System.out.println("введите слово");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(myTranslator.translate(br.readLine()));
        } catch (IOException e){}
    }
}
