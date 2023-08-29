package com.proj17;

public class Person {
    public static int age;  // static field
    public int height;

    public void PrintAge() {
        System.out.println(age);
    }


    public static void PrintHello() {  // статичный метод
        System.out.println("Hello");
        //this.height = 180;  // так делать нельзя - статичный метод не может использовать нестатичное поле
        //this.age = 23;  // так делать тоже нельзя
        // !!! из статичного метода можно обращаться только к статичным полям и статичным методам
    }


    public final int eyeSise = 6;  // значение final поля указывается сразу и не изменяется в ходе программы
    // final методы нельзя переопределить
    // final класс не может иметь наследников

}
