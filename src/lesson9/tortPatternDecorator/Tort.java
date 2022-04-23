package lesson9.tortPatternDecorator;

public class Tort implements Baking {


    @Override
    public long getPrice() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Торт";
    }

    @Override
    public void about() {
        System.out.println(getDescription() + " и его цена " + getPrice());

    }


}
