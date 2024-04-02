package DecoratorPattern;

public class Jalapeno extends ToppingDecorator{
    
    BasePizza basePizza;

    Jalapeno(BasePizza basePizza){
        this.basePizza=basePizza;
    }

    public int cost(){
        return this.basePizza.cost()+10;
    }
}
