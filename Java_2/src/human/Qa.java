package human;

public class Qa extends Employee implements Testing, Develop{

    public Qa(String name, String position) {
        super(name, position);
    }

    @Override
    public void working() {
        System.out.println("Qa is working");
    }

    @Override
    public void testing() {
        System.out.println("I'm testing");
    }

    @Override
    public void development() {
        System.out.println("I'm develop");
    }
}
