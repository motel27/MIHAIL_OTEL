package homework_nr_7;

public class Invoice {

    String model;
    String description;
    int quantity;
    int price;

    public Invoice(String model, String description, int quantity, int price) {
        this.model = model;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getAmount() {
        if (getQuantity() == 0  ||  getPrice() ==0)  {
            return 0;
        }
        return price * quantity;
    }


    public static void main(String[] args) {


        Invoice invoice1 = new Invoice("ASUS","laptop",12,20000);    // both are set
        Invoice invoice2 = new Invoice("Dell", "PC", 0, 15000);      // quantity is 0
        Invoice invoice3 = new Invoice("Lenovo", "Laptop", 50, 0);   // price is 0

        System.out.println(invoice1.getAmount());
        System.out.println(invoice2.getAmount());
        System.out.println(invoice3.getAmount());
   }
}


