package DecoratorDesignPattern;

public abstract class Decorator implements BaseCoffee{
    BaseCoffee coffee;

    public Decorator(BaseCoffee obj){
        this.coffee = obj;
    }
}
