package prakticheskoe_zadanie_6;

import java.time.Year;

//Класс Животное - это абстрактный/шаблонный класс, от него будут наследоваться другие классы
public abstract class Animal extends Object {

    protected String name;//у животного должна быть какая-то кличка
    protected int run;//животное может бежать, передаём сколько МАКСИМАЛЬНО метров животное может пробежать
    protected int sail;//животное может плыть, передаём сколько МАКСИМАЛЬНО метров животное может проплыть
    protected double jump;//животное может прыгать, передаём на сколько МАКСИМАЛЬНО метров животное может подпрыгнуть
    protected int age;//Пусть у животоного будет ещё и возраст

    public Animal(String name, int run, int sail, double jump, int age) {
        this.name = name;//Имя должно быть
        this.run = run;//Если передаём ноль, то это означает, что животное не может бегать
        this.sail = sail;//Если передаём ноль, то это означает, что животное не может плыть
        this.jump = jump;//Если передаём ноль, то это означает, что животное не может подпрыгивать
        this.age = age;//Возраст должен быть
    }

    //конструктор, у которого есть кличка животного(есть только один аргумент)
    public Animal(String name) {
        this(name, 0, 0, 0, 0);
    }

/*    //пустой конструктор
    public Animal() {
        this(null);
    }*/


    @Override
    public String toString() {
        return "Животное: {" + "Кличка: '" + name + '\'' + ", Бегает на: " + run + " м." + ", Плывёт на: " + sail + " м."   + ", Прыгаёт на: " + jump + " м."  + ", Возраст: " + age + '}';
    }


/*    public void voice() {
        System.out.println("Животное говорит: ");
    }*/
}