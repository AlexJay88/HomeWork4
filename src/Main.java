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



    public static void task1 () {
        System.out.println("Задача 1");
        int age = 40;
        if (age >= 18) {
            System.out.println("Возраст человека равен 18 или более лет,то он совершеннолетний");
        }

        if (age < 18) {
            System.out.println("Возраст человека меньше 18,он не достиг совершеннолетия, нужно немного подождать");
        }
    }


        public static void task2() {
            System.out.println("Задача 2");
            int temperature = 6;
            if (temperature >5) {
                System.out.println("На улице больше 5 градусов, можно идти без шапки");
            }

            if (temperature < 5) {
                System.out.println("На улице меньше 5 градусов, нужно надеть шапку");
            }
        }
    public static void task3() {
        System.out.println("Задача 3");
        int speed = 43;
        if (speed >60) {
            System.out.println("Если скорость больше 60,придется заплатить штраф");
        }

        if (speed < 60) {
            System.out.println("Если скорость меньше 60,можно ездить спокойно");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");

        int age = 40;
        if (age >= 2 && age <= 6) {
            System.out.println("Человеку от 2 до 6 лет, ему нужно ходить в детский сад");}
        else if (age >= 7 && age <= 18) {
            System.out.println("Человеку от 7 до 18 лет, ему нужно ходить в школу");}

        else if(age> 18 && age < 24) {
            System.out.println("Человеку больше 18 лет, но меньше 24, его место в университете");
        }
        else {
            System.out.println("Человеку больше 24, ему пора ходить на работу");
        }
    }

    public static void task5() {
            System.out.println("Задача 5");
        int ageKid = 15;
        if (ageKid > 5 && ageKid < 14 ) {
            System.out.println("Ребенку больше 5, но меньше 14 лет, он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else if(ageKid>14)
            System.out.println("Ребенок старше 14 лет, он может кататься без сопровождения взрослого");
     else {
        System.out.println("Ребенку меньше 5 лет, он не может кататься на аттракционе");
        }
    }
        public static void task6() {
            System.out.println("Задача 6");
          int  freePlaces=59;
          if (freePlaces>=60 && freePlaces<=102)
              System.out.println("Свободных мест в вагоне  больше 60, есть сидячие и  стоячие места");
          else if(freePlaces<60)
              System.out.println("Свободных мест в вагоне меньше 60, есть только  стоячие места");
          else {
              System.out.println("Свободных мест в вагоне нет, поезд  забит");
          }
        }
            public static void task7() {
                System.out.println("Задача 7");
                int one = 2400;
                int two = 1600;
                int three =4300;
                if (three>one && three > two){
                    System.out.println("Три больше двух и одного ");}
               else if (two > one && two > three){
                    System.out.println("Два больше одного и трех");
                }else {
                 System.out.println("Один больше двух и трех");


    }
}
}

















































