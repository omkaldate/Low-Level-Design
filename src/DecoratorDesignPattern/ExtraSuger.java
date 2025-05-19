package DecoratorDesignPattern;

public class ExtraSuger extends Decorator{

    ExtraSuger(BaseCoffee obj){
        super(obj);
    }

    @Override
    public String discription() {
        return super.coffee.discription()+ " ExtraSuger ";
    }

    @Override
    public int cost() {
        return super.coffee.cost()+5;
    }
}
