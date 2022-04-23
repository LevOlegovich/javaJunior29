package lesson15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;


public class TestTinkoff {

//    По вершинам правильного 2019-угольника ходит представитель Тинькофф.
//    Вершины 2019-угольника пронумерованы по порядку.
//    За один шаг он переходит сразу на +15углов (Т.е. 1,16,31ит.д.), и так по кругу.
//    Как только представитель попадает в ту точку,где он уже был,он останавливается.
//    Свой поход представитель начинает в углу под номером 1.
//    Сколько углов он обойдет?

    public static void main(String[] args) {

        ArrayList<Long> b = new ArrayList<>();


        for (long k = 1; k <= 2019; k = k + 15) {
            b.add(k);
        }

        int step = 15; // шаг
        long countSteps = b.size() - 1; // количество сделанных шагов (посещенных углов)
        long countRepeat = 1; // прошли первый круг
        long i = b.get(b.size() - 1) + step; //или = 7; // начало следующего круга
        boolean checkPoint = false;

        System.out.println(b);//
        System.out.println();
        System.out.println("Последний угол в первом круге. Номер: " + b.get(b.size() - 1));


        do {

            if (i > 2019) { // начало следующего круга. Начинается со второго
                i = i - 2019;
            }
            countRepeat = countRepeat + 1; // круг 2 и т.д


            for (; i <= 2019; i = i + step) {

                countSteps = countSteps + 1;
                if (b.contains(i)) {
                    System.out.print("Ура! Представитель компании вернулся в исходный угол " + i);
                    System.out.println();
                    checkPoint = true;
                }


                if (checkPoint == true) {

                    System.out.println("Это произошло на " + countRepeat + " круге");
                    System.out.println();
                    System.out.println("Отает:" +
                            "Количесвто  шагов (количество посещенных РАЗНЫХ углов) = " + countSteps);
                    System.out.println();
                    return;

                }

            }


        } while (countRepeat < 5000);// если что условие поменять на true, в зависимости от задачи.


    }


}

