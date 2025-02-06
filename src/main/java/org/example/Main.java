package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<>();
        firstList.add(1);
        firstList.add(2);
        firstList.add(3);
        firstList.add(4);
        firstList.add(5);

        List<Integer> secondList = new ArrayList<>();

        ListIterator<Integer> iterator = firstList.listIterator(firstList.size());
        while (iterator.hasPrevious()) {
            secondList.add(iterator.previous());
            }

        System.out.println("First list: " + firstList);
        System.out.println("Second list (reversed): " + secondList);
        }
}
