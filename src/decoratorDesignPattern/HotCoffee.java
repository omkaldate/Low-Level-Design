package decoratorDesignPattern;

public class HotCoffee implements BaseCoffee{
    @Override
    public String discription() {
        return "HotCoffee";
    }

    @Override
    public int cost() {
        return 30;
    }
}
