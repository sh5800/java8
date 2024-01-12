package functionalInterface;


import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

class FunctionImpl implements Function<String, Integer>{


    @Override
    public Integer apply(String s) {
        return s.length();
    }
}

class ConsumerImpl implements Consumer<String>{


    @Override
    public void accept(String input) {
        System.out.println(input);
    }
}

class SupplierImpl implements Supplier<LocalDateTime>{

    /**
     * Gets a result.
     *
     * @return a result
     */
    @Override
    public LocalDateTime get() {
        return LocalDateTime.now();
    }
}

public class FunctionalInterfaceRunner {
    public static void main(String[] args) {
//        FunctionImpl functionImpl = new FunctionImpl();
//        System.out.println(functionImpl.apply("Shreyash"));

        Function<String,Integer> function = (String s) -> s.length();
        System.out.println(function.apply("Shreyash"));

//        ConsumerImpl consumerImpl = new ConsumerImpl();
//        consumerImpl.accept("Hello");

        Consumer<String> consumer = (s) -> {
            System.out.println(s);
        };
        consumer.accept("World");

//        SupplierImpl supplierImpl = new SupplierImpl();
//        System.out.println(supplierImpl.get());

        Supplier<LocalDateTime> supplier = () -> {
           return LocalDateTime.now();
        };

        System.out.println(supplier.get());
    }
}
