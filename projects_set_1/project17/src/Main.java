// static and final

import com.proj17.*;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person();

        //person1.age;  // так делать нельзя - статичное поле не принадлежит объекту класса
        Person.age = 21;  // статичное поле принадлежит всему класса

        Person person2 = new Person();
        Person person3 = new Person();

        person1.PrintAge();
        person2.PrintAge();
        person3.PrintAge();  // получаем одинаковые значения


        //person1.PrintHello();  // статичный метод не принадлежит объекту класса
        Person.PrintHello();  // статичный метод принадлежит всему класса


        //person1.eyeSise = 7;  // так делать нельзя - значение final поля изменить нельзя

    }
}
