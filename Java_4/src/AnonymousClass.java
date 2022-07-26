
public class AnonymousClass {

    public static void main(String[] args) {

        Runnable tiger = (a, b) -> System.out.println("Tiger is run, speed - " + a + " in " + b);

        Runnable zebra = (a, b) -> System.out.println("Zebra is run, speed - " + a);

        tiger.run(100, "Africa");
        zebra.run(37, "Africa");
    }
}
