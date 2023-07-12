public class ElectronicProductFactory extends ProductFactory {
    Product createProduct(String name, int price){
        return new ElectronicProduct(name, price);
    }
}