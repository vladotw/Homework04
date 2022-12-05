public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();


    }
    public static void task1() {
        System.out.println("Задача 1");
        System.out.println();

        int age = 10;

        if (age >= 18) {
            System.out.println("Вам 18 или более лет");
        }
        else  {
            System.out.println("Вам меньше 18 лет");
        }

        System.out.println();
        System.out.println();
    }


    public static void task2() {
        System.out.println("Задача 2");
        System.out.println();

        int outdoorTemperature = -3;

        if (outdoorTemperature < 5) {
            System.out.println("На улице " + outdoorTemperature + " градусов, нужно надеть " +
                    "шапку");
        }

        else {
            System.out.println("На улице " + outdoorTemperature + " градусов, можно идти " +
                    "без шапки");
        }

        System.out.println();
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        System.out.println();

        int speed = 70;

        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придётся заплатить штраф");
        }
        else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }

        System.out.println();
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        System.out.println();

        int age = 27;
        boolean needToGoToNursery = age > 2 && age <=6;
        boolean needToGoToSchool = age >= 7 && age <= 18;
        boolean needToGoToUniversity  = age > 18 && age < 24;
        boolean needToGoToWork = age >= 24;

        if(needToGoToNursery) {
            System.out.println("Если возраст человека равен " + age + ", то ему " +
                    "нужно ходить в детский сад");
        }
        else if(needToGoToSchool) {
            System.out.println("Если возраст человека равен " + age + ", то " +
                    "ему нужно ходить в школу");
        }
        else if(needToGoToUniversity) {
            System.out.println("Если возраст человека равен " + age +
                    ", то его место в университете");
        }
        else if(needToGoToWork) {
            System.out.println("Если возраст человека равен " + age +
                                ", то ему пора ходить на работу");
        }
        System.out.println();
        System.out.println();
    }


}