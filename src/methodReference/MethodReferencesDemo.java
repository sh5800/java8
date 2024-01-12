package methodReference;

import java.util.function.Function;

@FunctionalInterface
interface Printable{
    void print(String msg);
}

public class MethodReferencesDemo {

    public static void display(String msg){
        msg.toLowerCase();
//        System.out.println(msg);
    }

    public static void main(String[] args) {
        //1. method reference to a static method
        Function<Integer, Double> function = (input) -> Math.sqrt(input);
        System.out.println(function.apply(5));

        //with method reference
        Function<Integer, Double> functionMethodRef =  Math::sqrt; //remove params, remove ->, remove return, add:: inplace of . for static method
        System.out.println(functionMethodRef.apply(7));

        //2. method reference to an instance variable of a particular object
        MethodReferencesDemo methodReferencesDemo = new MethodReferencesDemo();

        //lambda expression
        Printable printable = (msg) -> display(msg);
        printable.print("Hello");

    }
}
