package com.itheima.myfile.a01test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        Collections.addAll(list1, "李兴旺,23", "刘天乐,24", "张浩然,23", "杨有源,23", "李情缘,23", "吴成林,23");
        Collections.addAll(list2, "杨文彦,23", "萌萌,24", "李欣悦,23", "杨枝甘露,23", "不知道,23", "擦眼泪,23");

        Stream<String> stream1 = list1.stream()
                .filter(s -> s.split(",")[0].length() == 3)
                .limit(2);

        Stream<String> stream2 = list2.stream()
                .filter(s -> s.split(",")[0].startsWith("杨"))
                .skip(1);
        /*
        Stream.concat(stream1,stream2).map(new Function<String, Actor>() {
            @Override
            public Actor apply(String s) {
                String name = s.split(",")[0];
                Integer age = Integer.parseInt(s.split(",")[1]);
                return new Actor(name,age);
            }
        }).forEach(s -> System.out.println(s));

         */
        List<Actor> list = Stream.concat(stream1, stream2).map(s ->
                new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1]))
        ).collect(Collectors.toList());

        System.out.println(list);

    }
}
