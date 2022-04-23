package lesson2;

public class Main {
    public static void main(String[] args) {
        int money=1000;
        int pizzaCost=230;
        int bubbleCost=26;
        double candyCost=2.5;

        //математические операторы в java
        //+   -  /   *
        // ++ (увеличение себя на единицу)
        //--(уменьшение)
        // % вычисление остатка от деления 10%3=1; 12%2=0; 3/2=1;


        int canByPizza=money/pizzaCost; //получится целое число!!!
        int restAfterPizza=money%pizzaCost;
        int canByBubble=restAfterPizza/bubbleCost;
        int restAfterBubbleBy=restAfterPizza%canByBubble;

        int canByCandy=(int)(restAfterBubbleBy/candyCost);
        double totalRest=restAfterBubbleBy-(candyCost*canByCandy);

    }


}
