// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ProductFactory cp = new ElectronicProductFactory();
        Product p = cp.createProduct("Laptop", 2000);
        p.addDetails();
        System.out.println("Created " + p.getName() + " of price " + p.getPrice());
    }
}