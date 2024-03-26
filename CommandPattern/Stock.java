package CommandPattern;

public class Stock {
    private String stockName="Reliance";
    private int quantity=10;
    Stock(){
        
    }
    public void sell(){
        System.out.println("Sold the Stock " + stockName);
    }

    public void buy(){
        System.out.println("Bought the Stock of quantity " +quantity);
    }
}
