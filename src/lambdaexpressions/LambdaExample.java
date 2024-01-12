package lambdaexpressions;

interface Shape{
    void draw();

    default void m1(){
        System.out.println("Default method of shape interface");
    };
}



class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Square draw method");
    }
}

class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Circle draw method");
    }
}
public class LambdaExample {
    public static void main(String[] args) {

//        Shape rectangle = () -> System.out.println("Rectangle class draw method");
//        rectangle.draw();


//        Shape square = () -> System.out.println("Square class draw method");
//        square.draw();

        Shape circle = ()->{
            System.out.println("Circle class draw method");
        };

        circle.draw();

        print(()->{
            System.out.println("New draw method");  //pass implementation of abstract method as a parameter of the print function.
        });

        Square square = new Square();
        square.m1();

    }
    private static void print(Shape shape){
        shape.draw();
    }
}
