package org.example.Lesson_2;

public class Method_Visokos {
    public static boolean visokos(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) {
            return false;
        } else {
            return true;
        }
    }
}
