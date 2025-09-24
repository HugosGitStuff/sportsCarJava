// our creation sandbox/playground

public class Main {
    public static void main(String[] args){

        // First instance to my Sports Car
        SportsCar sportsCar = new SportsCar();

        // assign value to my instance
        sportsCar.maker = "Ferrari";
        sportsCar.engine = "V8";
        sportsCar.color = "Red";

        // new instance with dif values
        SportsCar sportsCar1 = new SportsCar();
        sportsCar1.maker = "Lamborghini";
        sportsCar1.engine = "V12";
        sportsCar1.color = "Yellow";

        // Test Ferrari at cruise speed
        System.out.println(sportsCar.driveSpeed(50));

        // Test Lamborghini at race speed
        System.out.println(sportsCar1.driveSpeed(200));
    }
}
