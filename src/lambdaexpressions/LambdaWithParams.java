package lambdaexpressions;

interface Addable{
    int addition(int a, int b);
}

class AddableImpl implements Addable{

    @Override
    public int addition(int a, int b) {
        return a+b;
    }
}

public class LambdaWithParams {
    public static void main(String[] args) {

       Addable addable =  ( a,  b) ->{
            return (a+b);
        };

        System.out.println(addable.addition(3,4));

        Addable abc = (a,b) ->{
            int c = a+b;
            return c;
        };

        System.out.println(abc.addition(4,5));
    }
}
