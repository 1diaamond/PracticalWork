package com.alpha.work1;

import java.util.*;
import java.util.function.Predicate;

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

        System.out.println(" Sum method result: ");
        Integer[] integers1 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(sumEven(integers1, (x) -> x%2==0 ));

        System.out.println(" Print method result: ");
        printStr(stringList,(s -> s.startsWith("x")));

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
    
    private Integer sumEven (Integer[] integers, Predicate<Integer> isEven){
        int result = 0;
        for (int i : integers) {
            if (isEven.test(i)){
                result+=i;
            }
        }
        return result;
    }

    private void printStr(List<String>strings, Predicate<String> predicate){
        for (String s : strings) {
            if (predicate.test(s)){
                System.out.println(s);
            }
        }
    }

}
