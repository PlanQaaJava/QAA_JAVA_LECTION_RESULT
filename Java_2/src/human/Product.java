package human;

public class Product extends Employee implements Sell{

    public Product(String name, String position) {
        super(name, position);
    }

    @Override
    public void working() {
        System.out.println("Product is working");
    }

    @Override
    public void selling() {
        System.out.println("I'm selling");
    }
}
