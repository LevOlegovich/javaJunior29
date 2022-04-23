package lesson7;

public class Main2 {
    public static void main(String[] args) {
        Tovar tovar = new Tovar("Мышка", 2000);
        Proizvoditel lg = new Proizvoditel("LG");
        lg.getDescription("Это корейский производитель");
        lg.setPathToImage("C:/lkjk");

        tovar.setProizvoditel(lg);


        User user = new User("Vasya_Pupkin", "Вася Пупкин", 100);
        user.setPathToAvatar("C://dowloads//image.jpg");

        Otziv otziv=new Otziv();
        otziv.setUser(user);
        otziv.setRating(5);
        otziv.setMainText("Покупал,все отлично! Все работает");

        tovar.addOtzivToTovar(otziv);
        System.out.println();

//                                 Дз
        // создать типы:  круг, треугольник, прямоугольник, квадрат, Овал

        // Прописать в них нужные поля класса (сами определяем где какие )
        // создать get-set и конструкторы
        //создать get -set и контсрукторы
        //создать в Main по одному объекту каждого класса и установить все характеристики
    }
}
