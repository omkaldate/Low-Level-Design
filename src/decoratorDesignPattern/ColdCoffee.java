package decoratorDesignPattern;

public class ColdCoffee implements BaseCoffee{

    @Override
    public String discription() {
        return "ColdCoffee";
    }

    @Override
    public int cost() {
        return 50;
    }
}
