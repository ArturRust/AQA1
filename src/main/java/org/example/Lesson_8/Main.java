package org.example.Lesson_8;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneBook phonebook = new PhoneBook();
        phonebook.add("Иванов", "123-45-67");
        phonebook.add("Петров", "234-56-78");
        phonebook.add("Иванов", "345-67-89");

        List<String> ivanovPhones = phonebook.get("Иванов");
        System.out.println("Телефоны Иванова: " + ivanovPhones);

        List<String> petrovPhones = phonebook.get("Петров");
        System.out.println("Телефоны Петрова: " + petrovPhones);
    }
}
