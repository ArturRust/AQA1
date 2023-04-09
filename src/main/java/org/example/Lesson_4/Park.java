package org.example.Lesson_4;

public class Park {

    private String name;
    private int size;
    private Attractions[] attractions;

    public Park(String name, int size) {
        this.name = name;
        this.size = size;
        this.attractions = new Attractions[size];
    }

    public void addAttraction(String name, String time, double price, int index) {
        Attractions newAttraction = new Attractions(name, time, price);
        attractions[index] = newAttraction;
    }

    public void printAttractions() {
        for (Attractions attraction : attractions) {
            System.out.println(attraction.getName() + " - " + attraction.getTime() + " - $" + attraction.getPrice());
        }
    }

    private class Attractions {
        private String name;
        private String time;
        private double price;

        public Attractions(String name, String time, double price) {
            this.name = name;
            this.time = time;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public String getTime() {
            return time;
        }

        public double getPrice() {
            return price;
        }
    }
}
