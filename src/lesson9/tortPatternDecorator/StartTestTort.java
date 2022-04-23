package lesson9.tortPatternDecorator;

public class StartTestTort {
    public static void main(String[] args) {
        Baking baking = new Tort();
        baking.about();


        Baking bakingWithCrem = new Crem(baking);
        bakingWithCrem.about();

        Baking bakingWithChocolate = new Chocolate(baking);
        bakingWithChocolate.about();

        System.out.println("/////////////////////////");

        //Следующее реализовано на уроке. Но мне не нравится как выводит.Ожидаем с шоколадом но выводит сшоколадом и кремом

        baking = new Crem(baking);
        baking.about();

        baking = new Chocolate(baking);
        baking.about();

    }
}
