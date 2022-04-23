package lesson9.tortPatternDecorator;


//Интерфейс. Объект интерфейса нельзя создать.
// все методыдо java8 это Абстрактные методы. Дальше дополнительно  появились дефолтные методы.
// Все поля(переменные) в интерфейсе константы (то есть можно опустить выражение например public static final...

public interface Baking {


    long getPrice();
    String getDescription();
    void about();

}
