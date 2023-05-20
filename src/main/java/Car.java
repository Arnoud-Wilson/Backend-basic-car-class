public class Car {
    String brand;
    String model;
    String year;
    String color;
    String engine;

    public Car(String brand, String model, String year, String color, String engine) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engine = engine;
    }

    public void printCarStatistics() {
        System.out.println("Deze " + brand + " " + model + " is " + color);
    }
}
