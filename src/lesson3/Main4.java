package lesson3;

public class Main4 {
    public static void main(String[] args) {
        String password = "weyuwenfc,";
        int dlina = password.length();
        if (dlina < 8) {
            System.out.println("Пароль меньше 8 символов!!!");

        }

        // проверить на наличие цифры

        if (!password.contains("0") && !password.contains("1") && !password.contains("2") &&
                !password.contains("3") && !password.contains("4") && !password.contains("5") &&
                !password.contains("5") && !password.contains("6") && !password.contains("7") &&
                !password.contains("8") && !password.contains("9")) {
            System.out.println("Пароль не содержит цифры");
        }
        System.out.println(password.charAt(0));
    }
}
