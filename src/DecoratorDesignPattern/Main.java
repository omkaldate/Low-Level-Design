package DecoratorDesignPattern;

public class Main {
    public static void main(String[] args) {
        BaseCoffee cCoffee = new ExtraSuger(new ExtraMilk(new ColdCoffee()));
        System.out.println(cCoffee.discription());
        System.out.println(cCoffee.cost());
    }
}
