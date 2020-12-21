package prakticheskoe_zadanie_6;

import java.time.Year;

//у каждого класса должен быть свой собственный конструктор
public class Cat extends Animal {

    public Cat(String name, int run, int sail, double jump, int age) {
        super(name, run, sail, jump, age);
    }

    public Cat(String name, int run, double jump, int age) {
        super(name, run, 0, jump, age);
    }//Создаём для котов класс, где значение прыжка передаётся как НОЛЬ, что означает, что кот не может плавать

    public Cat(String name) {
        super(name);
    }

    //у кота есть ограничение на бег 200 м., данный метод проверяет пробежит кот указанную дистанцию или нет
    void cat_run_max_200_metrov(int distantsiya) {
        if (distantsiya < 200) {
            System.out.println("Ваш кот или кошка, по кличке: " + name + ", который/ая максимально бегает на " + run + " м., 200 метров не пробежит :-(");
            System.out.println("run: false");//В заданни не было сказано, что нужно морочить голову с boolean и т.п., а надо просто сообщить результат в консоль. Так и сделал. Не судите строго
        } else {
            System.out.println("Отлично, Ваш кот или кошка по кличке: " + name + ", который/ая максимально бегает на " + run + " м., 200 метров успешно пробежит без оглядки.");
            System.out.println("run: true");//В заданни не было сказано, что нужно морочить голову с boolean и т.п., а надо просто сообщить результат в консоль. Так и сделал. Не судите строго
        }
    }

    //у кота есть ограничение на прыжок в 2 м., данный метод проверяет прыгнет кот на 2 метра или не прыгнет
    void cat_jump_max_2_metra(double distantsiya) {
        if (distantsiya < 2) {
            System.out.println("Ваш кот или кошка, по кличке: " + name + ", который/ая максимально прыгает на " + jump + " м., на 2 метра не прыгнет :-(");
            System.out.println("jump: false");//В заданни не было сказано, что нужно морочить голову с boolean и т.п., а надо просто сообщить результат в консоль. Так и сделал. Не судите строго
        } else {
            System.out.println("Отлично, Ваш кот или кошка по кличке: " + name + ", который/ая максимально прыгает на " + jump + " м., на 2 метра прыгнет со свистом.");
            System.out.println("jump: true");//В заданни не было сказано, что нужно морочить голову с boolean и т.п., а надо просто сообщить результат в консоль. Так и сделал. Не судите строго
        }
    }

    //Переписываем, чтобы заменить слово Животное на Кто или кошка
    public String toString() {
        return "Кот или кошка: {" + "Кличка: '" + name + '\'' + ", Бегает на: " + run + " м." + ", Плывёт на: " + sail + " м." + ", Прыгаёт на: " + jump + " м." + ", Возраст: " + age + '}';
    }
    /*    public Cat(){
        super("Налл");
    }*/

/*    public Cat(int run, int sail, double jump) {
        super(run, sail, jump);
    }*/
}