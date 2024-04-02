package DecoratorPattern;

public class BlackOlive extends ToppingDecorator{
    
    BasePizza basePizza;

    BlackOlive(BasePizza basePizza){
        this.basePizza=basePizza;
    }

    public int cost(){
        return this.basePizza.cost()+25;
    }
}


