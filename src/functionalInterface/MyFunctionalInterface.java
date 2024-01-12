package functionalInterface;

@FunctionalInterface
public interface MyFunctionalInterface {
    void print(String msg);

    default void m1(){
        System.out.println("Default method");
    }

    static void m2(){
        System.out.println("Static method");
    }
}
