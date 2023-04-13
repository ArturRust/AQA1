package org.example.Lesson_8;

import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> phonebook;

    public PhoneBook() {
        phonebook = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        if (!phonebook.containsKey(surname)) {
            phonebook.put(surname, new ArrayList<>());
        }
        phonebook.get(surname).add(phoneNumber);
    }

    public List<String> get(String surname) {
        return phonebook.getOrDefault(surname, Collections.emptyList());
    }
}
