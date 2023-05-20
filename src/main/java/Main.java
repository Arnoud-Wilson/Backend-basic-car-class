
public class Main {
    public static void main(String[] args) {
        Car toyotaAygo = new Car("Toyota", "Aygo", "2016", "blauw", "1.2");
        Car fiat500 = new Car("Fiat", "500", "2019", "groen", "1.4");
        Car volvoCX90 = new Car("Volvo", "CX90", "2022", "zwart", "2.0");

        toyotaAygo.printCarStatistics();
        fiat500.printCarStatistics();
        volvoCX90.printCarStatistics();

    }
}
