package exceptions.example2;

public class ExceptionHandlingExample2 {
    public static void main(String[] args) {
        System.out.println("Program started....");
        Car car = new Car();
        car.name = "Audi";

        printCarName(car);
        car = null;

        try{
            printCarName(car);
        } catch(NullPointerException ex){
            System.out.println("Object was null.");
        }
    }

    private static void printCarName(Car car){
        System.out.println(car.name);
    }
}

class Car {
    String name;
}
