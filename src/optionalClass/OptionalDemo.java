package optionalClass;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String email = "abc@xyz.com";
        String offNullExample = "shreyash";
        // Optional object using of,empty, offNullable
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        Optional<String> emailOptional = Optional.of(email); //sure when an object contains a value
        System.out.println(emailOptional);

        Optional<String> offNullableExample = Optional.ofNullable(offNullExample); //when not sure when an object contains a value
//        System.out.println(offNullableExample.get()); //retrieve value from the optional container
//
//        if(offNullableExample.isPresent()){  //check if container holds some value
//            System.out.println(offNullableExample.get());
//        }else{
//            System.out.println("No value is present");
//        }

        String kashyap = offNullableExample.orElse("kashyap"); //throw a default value if value is not present or null
//        System.out.println(kashyap);

        String s = offNullableExample.orElseGet(() -> "kashyap"); //similar to orElse just takes supplier function as a parameter
        System.out.println(s);

        String emailDoesNotExist = offNullableExample.orElseThrow(() -> new IllegalArgumentException("No element is present")); //throw exception if no value is present
        System.out.println(emailDoesNotExist);

        Optional<String> gender = Optional.of("MALE");
        Optional<String> emptyOptional1 = Optional.empty();

        gender.ifPresent((s1) -> System.out.println("value is present"));  //executes only if value is present
        emptyOptional1.ifPresent((s2) -> System.out.println("No value is present")); //does not execute at all.

        String result = " abc ";
        if(result != null && result.contains("abc")){
            System.out.println(result);
        }

        Optional<String> optionalStr = Optional.of(result);
        optionalStr.filter((res) ->res.contains("abc"))  //filter the string, filter takes predicate function
                .map(String::trim) // map transform a value in optional from one type to another type, takes function functional interface as parameter
                .ifPresent((res) -> System.out.println(res)); //ifpresent takes consumer predicate function

    }
}
