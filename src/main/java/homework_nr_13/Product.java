package homework_nr_13;

import java.util.*;

public class Product {

    String name;
    double price;
    private Category category;


    public Product(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return name;

    }


    public static void main(String[] args) {
        List<Product> Products = new ArrayList<>();

        Products.add(new Product("PC", 40000.00, Category.ELECTRONICS));
        Products.add(new Product("Milk", 29.00, Category.FOOD));
        Products.add(new Product("Bread", 8.50, Category.FOOD));
        Products.add(new Product("Pasta", 60.50, Category.FOOD));
        Products.add(new Product("Notebook", 21000.99, Category.ELECTRONICS));
        Products.add(new Product("Monitor", 8000.99, Category.ELECTRONICS));
        Products.add(new Product("Mouse", 800.99, Category.ELECTRONICS));
        Products.add(new Product("Shoes", 1200.00, Category.CLOTHING));
        Products.add(new Product("Pants", 600.00, Category.CLOTHING));
        Products.add(new Product("Gloves", 100.00, Category.CLOTHING));

        List<String> priceOver30 = Products.stream()
                .filter(product -> product.getPrice() > 50)
                .map(product -> product.name)
                .toList();
            System.out.println("Products with price over 30: " + priceOver30);

        Optional<Product> mostExpensiveElectronics = Products.stream()
                .filter(product -> product.getCategory() == Category.ELECTRONICS)
                .max(Comparator.comparingDouble(Product -> Product.getPrice()));

        mostExpensiveElectronics.ifPresent(product ->
                System.out.println("Most Expensive Electronics: " + product));


        long CountFood = Products.stream()
                .filter(product -> product.getCategory() == Category.FOOD)
                .count();
            System.out.println("Total Amount of Category Food: " + CountFood);

        boolean hasCheapProduct = Products.stream()
                .anyMatch(product -> product.getPrice() < 20);
            System.out.println("Is there products cheaper than 20: " + hasCheapProduct);

        System.out.println("-----------------------------------------");

        List<List<String>> GeneralLists = new ArrayList<>();
        GeneralLists.add(Arrays.asList("Notebook", "Mobile", "Tablet"));
        GeneralLists.add(Arrays.asList("Milk", "Tea", "Coffee", "Juice"));
        GeneralLists.add(Arrays.asList("Belt", "Shoes", "Pants", "Shirt"));

        List<String> GeneralList = GeneralLists.stream()
                .flatMap(List -> List.stream())
                .toList();

        System.out.println("Total List: " + GeneralList);

    }

}
