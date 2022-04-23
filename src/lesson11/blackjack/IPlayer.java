package lesson11.blackjack;

public interface IPlayer {

    void addCardToHand(ICard card);

    boolean needMoreCard();

    void openHand();

    int countValuesHand();
    boolean isInGame();

    void setInGame(boolean iGame);

    String getName();
}
