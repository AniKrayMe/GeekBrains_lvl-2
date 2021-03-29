package com.company;


import java.util.*;

public class CollectionCalculator {

    /**
     * Печатает в консоль НЕповторяющийся элементы
     * @param array
     */
    public static void printNonRepetitiveElements(List<String> array){
        Set<String> setArray = new HashSet<>(array);
        System.out.println(setArray);
        System.out.println();
    }

    /**
     * Печетает в консоль повторяющийся элементы
     * @param array
     */
    public static void printRepetitiveElements(List<String> array){
        Map<String, Integer> duplicatedArray = new HashMap<>();
        array.forEach(a -> duplicatedArray.put(a, duplicatedArray.getOrDefault(a, 0) + 1));
        duplicatedArray.forEach((k, v) -> System.out.println(v + " times " + k));
    }




}


