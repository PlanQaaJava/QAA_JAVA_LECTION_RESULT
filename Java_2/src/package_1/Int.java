package package_1;

public interface Int {

    void methodInterface();

    default void someMethod(){
        System.out.println("Default method");
    }
}
