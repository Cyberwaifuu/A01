
public class Product {
    private String name;
    private int num;
    private double price;

    public Product(String name, double price, int num){
        this.name = name;
        this.num = num;
        this.price = price;
    }
    public int getNum(){
        return num;
    }
    public double getPrice(){
        return price;
    }
}