package P_factory;

class CarFactory {
    public Car createCar(String carType) {
        if (carType.equalsIgnoreCase("Sedan")) {
            return new Sedan();
        } else if (carType.equalsIgnoreCase("SUV")) {
            return new SUV();
        } else if (carType.equalsIgnoreCase("Hatchback")) {
            return new Hatchback();
        } else {
            throw new IllegalArgumentException("Unknown car type");
        }
    }
}
