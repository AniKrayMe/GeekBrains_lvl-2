package com.company;

import java.util.*;

public class Phonebook {
    private Map<String, List<Long>> phonebookMap;

    //region Constructor, toString equals and Hashmap
    public Phonebook() {
        phonebookMap = new HashMap<>();
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phonebook phonebook = (Phonebook) o;
        return Objects.equals(phonebookMap, phonebook.phonebookMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phonebookMap);
    }

    @Override
    public String toString() {
        return "Phonebook{" +
                "phonebookMap=" + phonebookMap +
                '}';
    }
    //endregion

    /**
     * Добовляет в Hashmap Фамилию и List номеров телефона
     * @param surname
     * @param phoneNumber
     */
    public void add(String surname, Long phoneNumber) {
        if (phonebookMap.containsKey(surname)) {
            List<Long> phones = phonebookMap.get(surname);
            phones.add(phoneNumber);
        } else {
            List<Long> newPhoneList = new ArrayList<>();
            newPhoneList.add(phoneNumber);
            phonebookMap.put(surname, newPhoneList);
        }
    }

    /**
     *
     * Выводит фамилию человека и номера котрые привязанны к нему
     *
     * @param surname
     */
    public void get(String surname) {
        if (phonebookMap.containsKey(surname)) {
            System.out.println(surname + " " + phonebookMap.get(surname));
        } else {
            System.out.println("INCORRECT INPUT:  " + " В телефонной книге нету такого человека");
        }
    }
}
