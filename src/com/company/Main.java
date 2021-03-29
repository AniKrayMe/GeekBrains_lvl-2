package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Задание 1
        List<String> array = new ArrayList<>(Arrays.asList(
                "Мадара", "Иначи", "Саске", "Какаши", "Гаара",
                "Джирайа", "Обито", "Мадара", "Джирайа", "Обито",
                "Гарра", "Сакура", "Мадара", "Джирайа", "Обито",
                "Саске", "Мадара", "Нагато", "Какаши", "Мадара"));

        CollectionCalculator.printNonRepetitiveElements(array);
        CollectionCalculator.printRepetitiveElements(array);

        //Задание 2
        Phonebook phonebook = new Phonebook();
        phonebook.add("Старк", 1234456L);
        phonebook.add("Старк", 54654L);
        phonebook.add("Смит", 5487546L);
        phonebook.add("Джонсон", 48546L);

        phonebook.get("Старк");
    }
}



