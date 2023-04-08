package org.example.Lesson_3;

public class Employee {
    private final String fio;
    private final String position;
    private final String email;
    private final String phone;
    private final double salary;
    private final int age;

    public Employee(String fio, String position, String email, String phone, double salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + fio);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan", "Manager", "john.smith@example.com", "+7-555-12-34", 80000.0, 35);
        employees[1] = new Employee("Petrov Gena", "Developer", "alice.johnson@example.com", "+7-555-56-78", 65000.0, 28);
        employees[2] = new Employee("Bob Jones", "Designer", "bob.jones@example.com", "+7-555-90-12", 55000.0, 42);
        employees[3] = new Employee("Karen Lee", "Sales", "karen.lee@example.com", "+7-555-34-56", 45000.0, 24);
        employees[4] = new Employee("Mike Brown", "Marketing", "mike.brown@example.com", "+7-555-78-90", 70000.0, 31);

        for (Employee employee : employees) {
            employee.displayInfo();
            System.out.println();
        }
    }
}
