package lesson3;

import java.util.Locale;

public class Main5 {
    public static void main(String[] args) {

        String email = "trPr22@li@mon.rus";

        
        //Содержится ли @
        // а она только одна
        //начало  и конец не может быть с символа
        // придумать еще...проверки

        //split- метод разрезать. вернется массив кусочков стринга


        String[] partsOfEmail = email.split("@");

//1
        if (partsOfEmail.length == 1) {
            System.out.println("Емайл не содержит собачки!");
        }
//2
        if (partsOfEmail.length > 2) {
            System.out.println("Емайл содержит более одной собачки!");

        }


//3 Проверка начального и конечного символов
        if (email.startsWith(".") || email.endsWith(".")) {
            System.out.println("Начало или конец  содержит недопустимые символы!");

        }

//4 Проверка длины логина.

        int startMail = email.indexOf("@");            //номер первого вхождения символа "@" в строке email
        String login = email.substring(0, startMail);  //извлечение подстроки,логина
        if (login.length() <= 8) {
            System.out.println("Логин должен содержать не меньше 8 символов!");
        }

//5 Проверка домена
        if (!email.endsWith(".ru")) {
            System.out.println("Email должен заканчиваться '.ru'");
        }


//6 Проверка на отсутствие верхнего регистра
        String low = email.toLowerCase();
        boolean hasLowerCase = email.equals(low);

        if (!hasLowerCase) {
            System.out.println("Email не должен содержать символы в верхнем регистре!");

        }


    }


}

