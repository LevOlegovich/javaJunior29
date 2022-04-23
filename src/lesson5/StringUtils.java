package lesson5;

public class StringUtils {
    /**
     * Формула создания метода
     * 1- Модификатор доступа(одно из 4х слов)
     *     public-виден внутри всего проекта
     *     package( или ничего не поставить) - виден внутри пакета и дочерним классом
     *     protected - внутри текущего класса и дочерним класса
     *     private - внутри текущего класса

     2 - static( или пишем или нет)
     3 - возвращаемый тип ( int, String, int[]...(ожидаемый тип данных)  или  void (если ничего не возвращает)
     4 - название метода ( с маленькой буквы, максимально описывая что деалет метод)
     5 - входящие параметры в  скобках () -- то без чего невозможно выполнить данный метод,
         указываем через запятую тип название,  тип название ...
     6- тело выполнения метода


     */

     // создадим метод который принимает текст и символ, считает сколько
     // символов таких в тексте и возвращает число.



    public static int countCharsFromText(String text, char ch){


        int count=0;
        for( int i=0; i<text.length();i++){
            char currentCh=text.charAt(i);
            if (ch==currentCh){
                count++;
            }
        }
        return (count);
    }

    //метод принимает входящим параметром текст, и печатает на консоль этот же текст в обратном порядке.

    public static void printRevers(String text) {
        for (int i=text.length()-1;i>=0;i--){
            System.out.print(text.charAt(i));

        }
        System.out.println();

    }
}
