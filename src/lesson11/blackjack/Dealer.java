package lesson11.blackjack;

public class Dealer extends Player implements IDealer{ //крупье

    public Dealer(){
        super("Крупье");
    }

    @Override
    public boolean needMoreCard() {
        if (countValuesHand()<18){
            return true;
        }
        return false;
    }
}
