package org.example.Lesson_4;

public class Cat extends Animals {
    private int appetite;
    private boolean satiety = false;
    protected static int count;

    public Cat(String name, int age, String color,int appetite) {
        super(name, age, color,appetite);
        count++;
    }

    public void eat(Plate p) {
        if (p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            satiety = true;
            System.out.println(name + " поел из миски. Сытость - " + satiety);
        } else {
            System.out.println(name + " не поел из миски. В миске мало еды.");
        }
    }

    public void meow() {
        System.out.println(name + " мяукает");
    }
    public static void printCount() {
        System.out.println("Котов создано: " + count);
    }

    @Override
    public void run(int distance) {
        if (distance > 200) {
            System.out.println("Кот не может пробежать больше 200 м.");
        } else {
            System.out.println(name + " пробежал " + distance + " м.");
        }
    }

    public void swim() {
        System.out.println("Кот не может плавать");
    }
}
