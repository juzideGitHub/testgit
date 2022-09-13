package com.threadt.test;

import java.util.ArrayList;
import java.util.List;

public class ArraysTest {
    public static void main(String[] args) {
//        String[] arr0 = new String[]{"com.threadt.test.A","com.threadt.test.B","com.threadt.test.C","D","E","F"};
//        String[] arr1 = new String[6];
//        System.out.println(Arrays.toString(arr0));
//        System.out.println(Arrays.toString(arr1));

        ArrayList<Integer> list = new ArrayList(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list.toString());

        List<Integer> lists = List.of(5,6,7,8);

        list.addAll(lists);




        int sum = 0;
        for (Integer integer : list) {
            System.out.println(integer);
            sum += integer;
        }
        System.out.println(sum+"-----------------");

        List<Integer> list0 = new ArrayList<Integer>();

        System.out.println(list0.getClass());

        list0.addAll(List.of(1,2,3,4));

        list0.add(5);

        for (Integer integer : list0) {
            System.out.println(integer);
        }

    }
}
