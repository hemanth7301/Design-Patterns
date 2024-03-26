package CommandPattern;

public class Main {
    public static void main(String Args[]){
        Stock stock = new Stock();
        Order buyStock=new BuyStock(stock);
        Order sellStock=new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        broker.placeOrder();
        
    }
}
