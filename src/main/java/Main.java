
public class Main {
    public static void main(String[] args) {
        Car fiat500 = new Car("fiat", "500", "2019", "groen", "1.4");
        Car volvoCX90 = new Car("Volvo", "CX90", "2022", "zwart", "2.0");
        Car toyotaAygo = new Car("Toyota", "Aygo", "2016", "blauw", "1.2");

        fiat500.printCarStatistics();
        volvoCX90.printCarStatistics();
        toyotaAygo.printCarStatistics();
    }
}
