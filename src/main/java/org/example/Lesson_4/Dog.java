package org.example.Lesson_4;

public class Dog extends Animals {
    protected static int count;

    public Dog(String name, int age, String color,int appetite) {
        super(name, age, color,appetite);
        count++;
    }

    public void bark() {
        System.out.println(name + " лает");
    }

    public static void printCount() {
        System.out.println("Собак создано: " + count);
    }

    @Override
    public void run(int distance) {
        if (distance > 500) {
            System.out.println("Собака не может пробежать больше 500 м.");
        } else {
            System.out.println(name + " пробежал " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance > 10) {
            System.out.println("Собака не может проплыть больше 10 м.");
        } else {
            System.out.println(name + " проплыл " + distance + " м.");
        }
    }
}
