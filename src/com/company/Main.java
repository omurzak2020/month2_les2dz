package com.company;

public class Main {

    public static void main(String[] args) {
     Printable cat =  createObject("cat");
     Printable cow =   createObject("cow");
     Printable dog =  createObject("dog");

     Printable[] printables = {cat,cow,dog};
        for (int i = 0; i < printables.length; i++) {
            printables[i].print();
        }
    }
    public static Printable createObject (String className) {

        return switch (className) {
            case "cat" -> new Cat(5,"russ");
            case "cow" -> new Cow("black","aziyt");
            case "dog" -> new Dog("akbar","alabay");
            default -> null;
        };
    }
}

       /* (Дэдлайн 16.09.2020 23:59) :
        a)  Доделать все пункты практического задания из презентации.
        b)  Создать 2х уровневую иерархию из 4х классов (1й - родитель --> 2й, 3й, 4й - дочерние,
        с отличающимися полями).
        c)  Создать Интерфейс Printable с методом void print();
        d)  Реализовать интерфейс Printable классами 2й, 3й и 4й, переопределить метод интерфейса
        так чтобы он распечатывал всю информацию о свойствах объекта.
        e)  В классе Main создать возвращаемый метод createObject(String className), который умеет
        создавать объекты класса 2й, 3й и 4й и после создания и задания свойств объекту метод возвращает
        ссылку на объект (пульт). Можно использовать switch для того чтоб определить какого
        типа нужно создать экземпляр объекта. Например если в параметре передается “2й”
        метод должен создать объект именно этого типа.
        f)  В главном классе Main создать 3 различных объекта классов 2й, 3й и 4й с помощью
        метода createOcject, и распечатать по ним информацию методом print();*/