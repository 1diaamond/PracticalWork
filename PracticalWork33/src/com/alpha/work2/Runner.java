package com.alpha.work2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    public void run(){
        List<Integer> list = Stream.iterate(10 , i -> i+10).limit(10).map(x-> x/2).collect(Collectors.toList());
        System.out.println(list);
        Random random = new Random();
        Stream.of("basdf", "qwery", "badse", "piuy", "Bazxdd", "baba" ).filter(s -> s.startsWith("b") ||s.startsWith("B")  ).sorted().forEach(s -> System.out.println(s));
        List<Person> people = Arrays.asList(
                new Person("Ivan", 20, "male"),
                new Person("Dariia", 23, "female"),
                new Person("Ihor", 28, "male"),
                new Person("Denys", 17, "male"),
                new Person("Hanna", 44, "female"),
                new Person("Peter", 25, "male"));

        people.stream()
                .filter(person -> person.getGender().equalsIgnoreCase("male") && person.getAge() >= 18 && person.getAge() <= 27 )
                .forEach(person -> System.out.println(person));

        System.out.println(people.stream()
                .filter(person -> person.getGender().equalsIgnoreCase("female"))
                .mapToDouble(p-> p.getAge()).average().getAsDouble());
    }


}
