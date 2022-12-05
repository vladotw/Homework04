public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }
    public static void task1() {
        System.out.println("Задача 1");
        System.out.println();

        int age = 10;

        if (age >= 18) {
            System.out.println("Вам 18 или более лет");
        }
        if (age < 18) {
            System.out.println("Вам меньше 18 лет");
        }

        System.out.println();
        System.out.println();
    }


    public static void task2 () {
        System.out.println("Задача 2");
        System.out.println();

        int outdoorTemperature = -3;

        if (outdoorTemperature < 5) {
            System.out.println("На улице " + outdoorTemperature + " градусов, нужно надеть " +
                    "шапку");
        }

        if (outdoorTemperature > 5) {
            System.out.println("На улице " + outdoorTemperature + " градусов, можно идти " +
                    "без шапки");
        }

        System.out.println();
        System.out.println();
    }

    public static void task3 () {
        System.out.println("Задача 3");
        System.out.println();

        int speed = 70;

        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придётся заплатить штраф");
        }
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }

        System.out.println();
        System.out.println();
    }



}