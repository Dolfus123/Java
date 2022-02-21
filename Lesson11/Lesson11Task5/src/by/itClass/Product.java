package by.itClass;

public class Product {
    private String name;
    private double price;
    private int lot;

    public Product() {
    }

    public Product(String name, double price, int lot) {
        this.name = name;
        this.price = price;
        this.lot = lot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getLot() {
        return lot;
    }

    public void setLot(int lot) {
        this.lot = lot;
    }

    public double getCost(){
        return price*lot;
    }
    public String toString(){
        return name+"; "+price+"; "+lot;
    }

}
