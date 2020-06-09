public class Perfume {
    
    private int ID;
    private double price;
    private String type;
    private String brand;
    
    public Perfume(int ID, double price, String type, String brand) {
        
        this.ID = ID;
        this.price = price;
        this.type = type;
        this.brand = brand;
    }
    
    public String getType() {
        
        return type;
    }
    
    public double getPrice() {
        
        return price;
    }
    
    public String toString() {
        
        return "ID: " + ID + ", Price: " + price + ", Type: " + type + ", Brand: " + brand;
    }
}
