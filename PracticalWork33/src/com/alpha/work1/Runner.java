package com.alpha.work1;

import java.util.*;

public class Runner {
    public void run() {
        Runner runner = new Runner();
        List<Integer> integers= Arrays.asList(runner.arrayCreator());
        System.out.println(integers);
        Collections.sort(integers, (a,b) -> b.compareTo(a));
        System.out.println(integers);
        List<String> stringList = runner.listCreator();
        System.out.println(stringList);
        Collections.sort(stringList, (a,b) -> b.compareTo(a));
        System.out.println(stringList);

    }

    private Integer[] arrayCreator(){
        Random random = new Random();
        Integer[] integers = new Integer[20];
        for (int i = 0; i < 20; i++) {
            integers[i] = random.nextInt(100) - 50;
        }
        return integers;
    }

    private List<String> listCreator(){
        Random random = new Random();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            char[] word = new char[random.nextInt(5)+5];
            for(int j = 0; j < word.length; j++)
            {
                word[j] = (char)('a' + random.nextInt(26));
            }
            list.add(new String(word));
        }
        return list;
    }


}
