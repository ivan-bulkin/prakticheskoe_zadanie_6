package prakticheskoe_zadanie_6;

import java.util.Scanner;

//Не очень понял, что именно надо было сделать в домашнем задании. Если надо было разобраться с наследованием классов, то думаю, что я разобрался
//Не судите строго
public class Main {

    static Scanner in = new Scanner(System.in);

    static Cat cat1 = new Cat("Василий", 100, 1, 1);
    static Cat cat2 = new Cat("Мудрец", 200, 0.5, 1);
    static Cat cat3 = new Cat("Балбес", 300, 3, 1);
    static Cat cat4 = new Cat("Матроскин", 400, 3, 1);

    static Dog dog1 = new Dog("Шарик", 400, 11, 0, 2);
    static Dog dog2 = new Dog("Арнольд", 600, 50, 0.1, 2);
    static Dog dog3 = new Dog("Прогресс", 200, 5, 1, 3);

    public static void main(String[] args) throws InterruptedException {

//        Dog dog = new Dog("Собака");
//        cat.age=1;
//        cat.name="fgdfgdfg";

        privetstvie_programmi();//Приветствие программы
        vibor_deistvya();//Выбираем, что именно делать
    }

    private static void vivodim_jivotnix_na_ekran() {
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
        System.out.println(cat4);

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
    }

    private static void vibor_deistvya() throws InterruptedException {
        int vibor_deistviya;
        do {
            vibor_deistviya = vvod_tselogo_chisla(1, 9, "Выберите нужный пункт меню");
            if (vibor_deistviya != -100) {
            } else {
                System.out.print("Вы ошиблись. ");
            }
            if (vibor_deistviya == 1) {
                System.out.println();
                System.out.println("Посмотреть, какие животные у нас есть в наличии(мы их предварительно задали):");
                vivodim_jivotnix_na_ekran();
            }
            if (vibor_deistviya == 2) {
                System.out.println();
                System.out.println("Проверить, какие из котов/кошек могут пробежать 200 метров:");
                cat1.cat_run_max_200_metrov(cat1.run);
                cat2.cat_run_max_200_metrov(cat2.run);
                cat3.cat_run_max_200_metrov(cat3.run);
                cat4.cat_run_max_200_metrov(cat4.run);
            }
            if (vibor_deistviya == 3) {
                System.out.println();
                System.out.println("Проверить, какие из собак могут пробежать 500 метров:");
                dog1.dog_run_max_500_metrov(dog1.run);
                dog2.dog_run_max_500_metrov(dog2.run);
                dog3.dog_run_max_500_metrov(dog3.run);
            }
            if (vibor_deistviya == 4) {
                System.out.println();
                System.out.println("Проверить, какие из котов/кошек могут прыгнуть на 2 метра в высоту:");
                cat1.cat_jump_max_2_metra((double) cat1.jump);
                cat2.cat_jump_max_2_metra(cat2.jump);
                cat3.cat_jump_max_2_metra(cat3.jump);
                cat4.cat_jump_max_2_metra(cat4.jump);
            }
            if (vibor_deistviya == 5) {
                System.out.println();
                System.out.println("Проверить, какие из собак прыгнут на 0.5 метра в высоту:");
                dog1.dog_jump_max_0_5_metra(dog1.jump);
                dog2.dog_jump_max_0_5_metra(dog2.jump);
                dog3.dog_jump_max_0_5_metra(dog3.jump);
            }
            if (vibor_deistviya == 6) {
                System.out.println();
                System.out.println("Проверить, какие коты/кошки умеют плавать:");
                System.out.println("Думаю ....");
                Thread.sleep(1000);//Задержка в 1000 миллисекунд
                System.out.println("Ну что Вы, зачем же мучить котиков, они не умеют плавать.");
                System.out.println("sail: false");
            }
            if (vibor_deistviya == 7) {
                System.out.println();
                System.out.println("Проверить, какие из собак могут проплыть 10 метров:");
                dog1.dog_sail_max_10_metrov(dog1.sail);
                dog2.dog_sail_max_10_metrov(dog2.sail);
                dog3.dog_sail_max_10_metrov(dog3.sail);
            }
            if (vibor_deistviya == 8) {
                System.out.println();
                System.out.println("Ввести дистанцию в метрах и показать, какие из собак пробегут данную дистанцию, а какие нет:");
                int vesti_distantsyu;
                do {
                    vesti_distantsyu = vvod_tselogo_chisla(100, 1000, "Введите сколько метров должны пробежать собаки");
                    if (vesti_distantsyu != -100) {
                        dog1.dog_zabeg_na_distantsiu(vesti_distantsyu);
                        dog2.dog_zabeg_na_distantsiu(vesti_distantsyu);
                        dog3.dog_zabeg_na_distantsiu(vesti_distantsyu);
                    } else {
                        System.out.print("Вы ошиблись. ");
                    }
                } while (vesti_distantsyu == -100);
            }
            if (vibor_deistviya == 9) {
                vixod_iz_programmi();
                privetstvie_programmi();
                vibor_deistvya();
            }
        }
        while (vibor_deistviya == -100);
        if (!vixod_iz_programmi()) {//надо будет привыкнуть к такому написанию
            privetstvie_programmi();
            vibor_deistvya();
        }
    }


    private static void privetstvie_programmi() {
        System.out.println("\n---=== Практическое задание к уроку № 6===---");
        System.out.println("Что надо сделать:");
        System.out.println("1. Создать классы Собака и Кот с наследованием от класса Животное.");
        System.out.println("2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.");
        System.out.println("   В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).");
        System.out.println("3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).");
        System.out.println("4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true)");
        System.out.println("5. Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.");
        System.out.println("                        Что сделано:");
        System.out.println("1. Посмотреть, какие животные у нас есть в наличии(мы их предварительно задали)");
        System.out.println("2. Проверить, какие из котов/кошек могут пробежать 200 метров");
        System.out.println("3. Проверить, какие из собак могут пробежать 500 метров");
        System.out.println("4. Проверить, какие из котов/кошек могут прыгнуть на 2 метра в высоту");
        System.out.println("5. Проверить, какие из собак могут прыгнут на 0.5 метра в высоту");
        System.out.println("6. Проверить, какие коты/кошки умеют плавать");
        System.out.println("7. Проверить, какие из собак могут проплыть 10 метров");
        System.out.println("8. Ввести дистанцию в метрах и показать, какие из собак пробегут данную дистанцию, а какие нет");
        System.out.println("9. Выходим из программы");
    }

    //Универсальная процедура ввода целого числа, буду её использовать в других программах
    //На вход процедуры передаём от какого до какого числа пользовательо должен ввести число
    //min_znachenie - меньше этого числа вводить нельзя
    //max_znachenie - больше этого числа вводить нельзя
    //возвращает -100, если число введено не верно и возвращает целое число, если число введено верно и в нужном интервале
    //message - сообщение пользователю о том, что именно надо вводить
    private static int vvod_tselogo_chisla(int min_znachenie, int max_znachenie, String message) {
        System.out.print(message + ", введите число от " + min_znachenie + " до " + max_znachenie + ": ");
        int vvedennoe_chislo = -100;
        if (in.hasNextInt()) {
            vvedennoe_chislo = in.nextInt();
            if (vvedennoe_chislo < min_znachenie || vvedennoe_chislo > max_znachenie) {
                vvedennoe_chislo = -100;
            }
        } else {
            in.next();
        }
        return vvedennoe_chislo;
    }

    //Универсальная процедура выхода из программы, буду её использовать в других программах
    //Выходит из программы, если пользователь выбирает "y", "yes", "д", "да", "+", "торжественно подтверждаю"
    //Возвращает false, если пользователь выбирает "n", "н", "-", "играть, так играть, продолжаем"
    //продолжает спрашивать о выходе, если пользователь ввёл любое другое значение
    private static boolean vixod_iz_programmi() {
        System.out.println("\nВыходим из программы, Вы уверены? y/n (д/н)");
        String n = in.next();
        switch (n) {
            case "y", "yes", "д", "да", "+", "торжественно подтверждаю" -> {
                System.out.println("\nДо новых встреч, ждём Вас снова.");
                in.close();//Необходимо закрыть объект in
                System.exit(0);
            }
            case "n", "н", "-", "играть, так играть, продолжаем" -> {
                System.out.println();
                return false;
            }
            default -> {
                System.out.printf("Вы ввели: " + n + ", такого значения нет в списке%n" + "Выберите y/n или д/н и попробуйте ещё разик.");
                vixod_iz_programmi();
            }
        }
        return false;
    }
}
