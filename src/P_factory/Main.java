package P_factory;

public class Main {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();

        // Create a Sedan
        Car mySedan = factory.createCar("Sedan");
        mySedan.drive(); // Output: Driving Sedan

        // Create an SUV
        Car mySUV = factory.createCar("SUV");
        mySUV.drive(); // Output: Driving SUV

        // Create a Hatchback
        Car myHatchback = factory.createCar("Hatchback");
        myHatchback.drive(); // Output: Driving Hatchback

        // Try to create an unknown type (should throw exception)
        Car unknownCar = factory.createCar("Sports Car"); // Throws IllegalArgumentException
    }
}
