package com.alpha.task1;

import java.util.*;

public class Runner {
    public void run(){
        List<String> listArray = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listArray.add("number_"+ i);
        }
        System.out.println(listArray);
        List<String> listLink = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(i+1);
            listLink.add(index,"num_"+ i);
        }
        System.out.println(listLink);
        int index = 0;
        ListIterator<String> listIterator = listArray.listIterator(listArray.size());
        while (listIterator.hasPrevious()){
            listLink.add(index, listIterator.previous());
            index += 2;
        }
        System.out.println(listLink);

    }
}
