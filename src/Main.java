public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

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

    public static void task5() {
        System.out.println("Задача 5");
        System.out.println();
        int age = 15;
        boolean canRideWithAdult = age >= 5 && age < 14;

        if(age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на " +
                    "аттракционе");
        }
        else if (canRideWithAdult) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на " +
                    "аттракционе в сопровождении  взрослого");
        }
        else if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на " +
                    "аттракционе без сопровождения взрослого");

        }
        System.out.println();
        System.out.println();

    }

    public static void task6() {
        System.out.println("Задача 6");
        System.out.println();

        int carriageCapacity = 102;
        int numberOfSittingPlaces = 60;

        int numberOfPassengers = 105;

        boolean sittingPlacesLeft = numberOfPassengers < numberOfSittingPlaces;
        boolean standingPlacesLeft = numberOfPassengers >= numberOfSittingPlaces &&
                numberOfPassengers < carriageCapacity;
        boolean noPlacesMore = numberOfPassengers == carriageCapacity;
        boolean carriageCrowded = numberOfPassengers > carriageCapacity;

        if (sittingPlacesLeft) {
            System.out.println("В вагоне ещё есть сидячие места");
        }
        else if (standingPlacesLeft) {
            System.out.println("В вагоне остались только стоячие места");
        }
        else if (noPlacesMore) {
            System.out.println("В вагоне не осталось свободных мест");
        }
        else if (carriageCrowded) {
            System.out.println("Вагон переполнен");
        }


        System.out.println();
        System.out.println();

    }

    public static void task7() {
        System.out.println("Задача 7");
        System.out.println();
        int one = 9;
        int two = 10;
        int three = 8;

        if (one > two && one > three) {
            System.out.println("Наиболльшее число " + one);
        } else if (two > one && two > three) {
            System.out.println("Наиболльшее число " + two);
            }
        else {
            System.out.println("Наиболльшее число " + three);
        }

    }
}