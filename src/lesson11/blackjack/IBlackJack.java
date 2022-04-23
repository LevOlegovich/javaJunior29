package lesson11.blackjack;

public interface IBlackJack {

    void addPlayer(IPlayer player);

    void gealTwoCards();

    void dealAllCards(); // раздать оставшиеся карты

    void printWinner();
}
