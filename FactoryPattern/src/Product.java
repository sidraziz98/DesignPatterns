public abstract class Product {
    String name;
    int price;

    void addDetails(){
        System.out.println("Details added here");
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }
}
