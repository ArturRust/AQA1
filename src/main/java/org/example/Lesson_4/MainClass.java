package org.example.Lesson_4;

public class MainClass {
    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик", 3, "рыжий",5);
        Dog sharik = new Dog("Шарик", 5, "черный",12);
        Animals turtle = new Animals("Черепаха", 10, "зеленый",6);

        Cat.printCount();
        Dog.printCount();
        Animals.printCount();
        Cat[] cats = {
                new Cat("Мурзик",5,"Черный", 5),
                new Cat("Васька",5,"Черный", 10),
                new Cat("Барсик",5,"Черный", 7)
        };

        Plate plate = new Plate(20);

        for (Cat cat : cats) {
            cat.eat(plate);
        }

        plate.addFood(10);

        System.out.println("В миске осталось еды - " + plate.getFood());
    }
}
