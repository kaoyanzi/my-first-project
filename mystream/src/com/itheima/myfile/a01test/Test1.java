package com.itheima.myfile.a01test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);

        List<Integer> newList = list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(newList);

    }
}
