package lesson11.blackjack;

public class MainGame {
    
    public static void main(String[] args) {

        // 09,04,2022 доделали,но уменя не корректно. Доработать

        BlackJack blackJack = new BlackJack();

        Player player1 = new Player("Вася");
        Player player2 = new Player("Петя");
        Dealer dealer = new Dealer();

        blackJack.addPlayer(player1);
        blackJack.addPlayer(player2);
        blackJack.addPlayer(dealer);

        blackJack.gealTwoCards();
        blackJack.dealAllCards();
        blackJack.printWinner();

        System.out.println();

    }
}
