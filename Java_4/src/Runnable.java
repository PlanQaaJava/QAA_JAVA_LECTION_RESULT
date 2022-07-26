@FunctionalInterface
public interface Runnable {

    void run(int speed, String place);

    default void runFast() {
        System.out.println("I'm running");
    }
}
