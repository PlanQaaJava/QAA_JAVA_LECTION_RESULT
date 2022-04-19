package human;

public class Dev extends Employee implements Develop{

    public Dev(String name, String position) {
        super(name, position);
    }

    @Override
    public void working() {
        System.out.println("Developer is working");
    }
}
