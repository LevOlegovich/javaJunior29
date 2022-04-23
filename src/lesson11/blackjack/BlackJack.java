package lesson11.blackjack;

import java.util.ArrayList;

public class BlackJack implements IBlackJack {

    private Koloda koloda = new Koloda();
    private ArrayList<IPlayer> players = new ArrayList<>();

    @Override
    public void addPlayer(IPlayer player) {
        players.add(player);

    }

    @Override
    public void gealTwoCards() {
        for (IPlayer player : players) {
            player.addCardToHand(koloda.getRandomCard());
            player.addCardToHand(koloda.getRandomCard());
        }

    }

    @Override
    public void dealAllCards() {
        for (IPlayer player : players) {
            while (player.needMoreCard()) { //// проявление полиморфизма
                player.addCardToHand(koloda.getRandomCard());
            }
        }

    }

    @Override
    public void printWinner() {
        // комбинации
        //21 21 34 19 18
        //19 22

        for (IPlayer player : players) {
            if (player.countValuesHand() > 21) {
                player.setInGame(false);
            }
        }

        if (countPlayersInGames() == 0) {
            for (IPlayer player : players) {
                if (player instanceof Dealer) {
                    System.out.println("----Победитель " + player.getName());
                    player.openHand();
                }
            }
        }




        //узнаем какое число выигрышное
        int winnerValue = 0;
        for (IPlayer player : players){
            if(player.isInGame()&& player.countValuesHand()>winnerValue){

            }
        }
        // печатаем победителей
        for (IPlayer player : players) {
            if (player.isInGame() && player.countValuesHand() == winnerValue) {
                winnerValue = player.countValuesHand();
                System.out.println("----Победитель " + player.getName());
            }

        }

    }


    public int countPlayersInGames() { // сколько игроков остадось в игре
        int count = 0;

        for (IPlayer player : players) {
            if (player.isInGame()) {
                count++;
            }
        }
        return count;
    }



}

