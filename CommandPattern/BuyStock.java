package CommandPattern;

public class BuyStock implements Order {

    Stock stock;

    public BuyStock(Stock stock){
        this.stock=stock;
    }
    
    public void execute(){
        stock.buy();
    }
}
