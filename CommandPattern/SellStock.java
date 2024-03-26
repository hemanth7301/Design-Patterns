package CommandPattern;

public class SellStock implements Order {

    Stock stock;

    public SellStock(Stock stock){
        this.stock=stock;
    }
    
    public void execute(){
        stock.sell();
    }
}
