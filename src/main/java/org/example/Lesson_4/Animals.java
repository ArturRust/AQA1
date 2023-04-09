package org.example.Lesson_4;

public class Animals {
    protected String name;
    protected int age;
    protected String color;
    protected static int count;
    protected int appetite;

    public Animals(String name, int age, String color,int appetite) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.appetite = appetite;
        count++;
    }

    public void eat() {
        System.out.println(name + " ест");
    }

    public void sleep() {
        System.out.println(name + " спит");
    }

    public static void printCount() {
        System.out.println("Животных создано: " + count);
    }

    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м.");
    }

    public void swim(int distance) {
        System.out.println(name + " проплыл " + distance + " м.");
    }
}
