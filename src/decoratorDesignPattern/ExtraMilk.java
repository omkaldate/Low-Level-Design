package decoratorDesignPattern;

public class ExtraMilk extends Decorator{

    ExtraMilk(BaseCoffee obj){
        super(obj);
    }
    @Override
    public String discription() {
        return super.coffee.discription()+" ExtraMilk ";
    }

    @Override
    public int cost() {
        return super.coffee.cost()+10;
    }
}
