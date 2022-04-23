package lesson3;

public class HomeWork1Lesson3 {
    public static void main(String[] args) {

       /*
       Есть массив чисел: 2,4,45,3,64,3,5
        1) Вывести на консоль сумму всех чисел внутри массива
        2) Вывести на консоль массив в обратном порядке
        3) Вывести на консоль через одну ячейку с начала
        4) *** Вывести на консоль те ячейки, у которых сумма двух "соседей" четная (бонусное задание по желанию)

       */


        //1.
        System.out.println("Задача №1. {2,  4,  45,  3,  64,  3,  5}");

        int[] numbers = {2, 4, 45, 3, 64, 3, 5};
        int summ = 0;

        for (int i = 0; i < numbers.length; i++) {
            summ = summ + numbers[i];
        }

        System.out.println("Сумма всех чисел массива: " + summ);
        System.out.println();


        //2.
        System.out.println("Задача №2. {2,  4,  45,  3,  64,  3,  5}");

        System.out.println("Массив в обратном порядке:");
        int[] reversMassiv = new int[numbers.length];
        for (int i = numbers.length - 1; i >= 0; i--) {
            reversMassiv[i] = numbers[i];
            System.out.print(reversMassiv[i] + " | ");
        }
        System.out.println("\n");


        //3.
        System.out.println("Задача №3. {2,  4,  45,  3,  64,  3,  5}");

        System.out.println("Элементы массива через одну ячейку сначала:");
        for (int i = 1; i < numbers.length; i = i + 2) {
            System.out.print(numbers[i] + " | ");
        }
        System.out.println("\n");


        //4.
        System.out.println("Задача №4. {2,  4,  45,  3,  64,  3,  5}");
        int next = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (next < numbers.length - 1) {
                next = i + 1;
                summ = numbers[i] + numbers[next];
                if (summ % 2 == 0) {
                    System.out.println("Две ячейки-соседки с четной сумммой: " + i + " и " + next);
                }

            }
        }
    }
}
