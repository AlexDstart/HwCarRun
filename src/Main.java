import Transport.*;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        DriverB[] driversB = new DriverB[4];
        driversB[0] = new DriverB("ФИО1 ", true, 10);
        driversB[1] = new DriverB("ФИО2 ", true, 5);
        driversB[2] = new DriverB("ФИО3 ", true, 30);
        driversB[3] = new DriverB("ФИО4 ", true, 20);

        DriverC[] driversC = new DriverC[4];
        driversC[0] = new DriverC("ФИО5 ", true, 40);
        driversC[1] = new DriverC("ФИО6 ", true, 26);
        driversC[2] = new DriverC("ФИО7 ", true, 18);
        driversC[3] = new DriverC("ФИО8 ", true, 34);

        DriverD[] driversD = new DriverD[4];
        driversD[0] = new DriverD("ФИО9 ", true, 40);
        driversD[1] = new DriverD("ФИО10 ", true, 26);
        driversD[2] = new DriverD("ФИО11 ", true, 18);
        driversD[3] = new DriverD("ФИО12 ", true, 34);

        Car[] cars = new Car[4];
        cars[0] = new Car("Нива", "2121", 1.7, driversB[0], "Внедорожник");
        cars[1] = new Car("Лада", "Гранта", 1.6, driversB[1], "Седан");
        cars[2] = new Car("Москвич", "3", 1.5, driversB[2], "Пикап");
        cars[3] = new Car("Лада", "Веста", 1.6, driversB[3], "Седан");

        printInfoTransport(cars);


        double[] gravity = {35, 11, 1.6, 4};
        Truck[] trucks = new Truck[4];
        trucks[0] = new Truck("Камаз", "65801", 6.7, driversC[0], TruckCapacity.getValue(gravity[0]));
        trucks[1] = new Truck("МАЗ", "6501", 11.6, driversC[1], TruckCapacity.getValue(gravity[1]));
        trucks[2] = new Truck("ЗИЛ", "157", 5.0, driversC[2], TruckCapacity.getValue(gravity[2]));
        trucks[3] = new Truck("ГАЗ", "66", 4.3, driversC[3], TruckCapacity.getValue(gravity[3]));


        Bus[] bus = new Bus[4];
        bus[0] = new Bus("ЛиАЗ", "5256", 6.7, driversD[0]);
        bus[1] = new Bus("НефАЗ", "5299", 7.5, driversD[1]);
        bus[2] = new Bus("КРАЗ", "103", 6.4, driversD[2]);
        bus[3] = new Bus("МАЗ", "3205", 4.25, driversD[3]);


        for (int i = 0; i < 4; i++) {
            printInfo(cars[i]);
            printInfo(trucks[i]);
        }
        List<Transport> transport = new ArrayList<>();
        transport.add(cars[0]);
        transport.add(cars[1]);
        System.out.println(transport);

    }

    private static void printInfo(Transport trasport) {
        System.out.println("Водитель " + trasport.getDriver().getName() +
                " управляет авто " + trasport.getBrand() +
                ", модель " + trasport.getModel() + ", объем двигателя " +
                trasport.getEngineVolume() + " и будет участвовать в заезде. ");
    }

    public static String printInfoTransport(Transport[] bus) {
        for (int i = 0; i < bus.length; i++) {
            System.out.println(bus[i]);
        }
        return BodyType.SUV.toString();

    }
    public static void checkTransport(Transport... transports) {
        for (Transport transport : transports) {
            try {
                transport.passDiagnostics();
            } catch (TransportTypeException e) {
                e.printStackTrace();
            }
        }
    }

}
