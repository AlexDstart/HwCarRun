import Transport.*;
import Transport.servicies.Mechanics;
import Transport.servicies.ServiceStation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        Mechanics mechanic1 = new Mechanics("Алексей", "Company1");
        Mechanics mechanic2 = new Mechanics("Геннадий", "Company2");
        Mechanics mechanic3 = new Mechanics("Виталий", "Company3");
        Mechanics mechanic4 = new Mechanics("Сергей", "Company4");
        Mechanics mechanic5 = new Mechanics("Иван", "Company5");

        List<Mechanics> listOfMechanics = new ArrayList<>();
        listOfMechanics.add(mechanic1);
        listOfMechanics.add(mechanic2);
        listOfMechanics.add(mechanic3);
        listOfMechanics.add(mechanic4);
        listOfMechanics.add(mechanic5);

        System.out.println(listOfMechanics);

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


        cars[0].setPerson(mechanic1);
        cars[1].setPerson(mechanic2);
        cars[2].setPerson(mechanic3);
        cars[3].setPerson(mechanic4);

        trucks[0].setPerson(mechanic1);
        trucks[1].setPerson(mechanic2);
        trucks[2].setPerson(mechanic3);
        trucks[3].setPerson(mechanic4);

        bus[0].setPerson(mechanic1);
        bus[1].setPerson(mechanic2);
        bus[2].setPerson(mechanic3);
        bus[3].setPerson(mechanic4);
        System.out.println();

        try {
            mechanic1.doDiagnostic(cars[1]);
            mechanic2.doDiagnostic(trucks[1]);
            mechanic5.doDiagnostic(bus[1]);
        } catch (TransportTypeException e) {
            System.err.println("Автобусам не нужна диагностика");
        }


        for (int i = 0; i < 4; i++) {
            printInfo(cars[i]);
            printInfo(trucks[i]);
        }
        List<Transport> transport = new ArrayList<>();
        transport.add(cars[0]);
        transport.add(cars[1]);
        transport.add(cars[2]);
        transport.add(cars[3]);
        transport.add(trucks[0]);
        transport.add(trucks[1]);
        transport.add(trucks[2]);
        transport.add(trucks[3]);
        transport.add(bus[0]);
        transport.add(bus[1]);
        transport.add(bus[2]);
        transport.add(bus[3]);
        System.out.println(transport);

        ServiceStation serviceStationForCar = new ServiceStation();
        ServiceStation serviceStationForTruck = new ServiceStation();
        serviceStationForCar.addIntoQueue(cars[0]);
        serviceStationForCar.addIntoQueue(cars[1]);
        serviceStationForCar.addIntoQueue(cars[2]);
        serviceStationForCar.addIntoQueue(cars[3]);

        serviceStationForTruck.addIntoQueue(trucks[0]);
        serviceStationForTruck.addIntoQueue(trucks[1]);
        serviceStationForTruck.addIntoQueue(trucks[2]);
        serviceStationForTruck.addIntoQueue(trucks[3]);

        serviceStationForCar.doDiagnostic();
        serviceStationForTruck.doDiagnostic();

        cars[0].setPerson(mechanic1);
        cars[1].setPerson(mechanic2);
        cars[2].setPerson(mechanic1);
        cars[3].setPerson(mechanic3);


        trucks[0].setPerson(mechanic2);
        trucks[1].setPerson(mechanic5);
        trucks[2].setPerson(mechanic3);
        trucks[3].setPerson(mechanic3);


        bus[0].setPerson(mechanic5);
        bus[1].setPerson(mechanic5);
        bus[2].setPerson(mechanic5);
        bus[3].setPerson(mechanic5);


        List<Mechanics> mechanicsOfCar1 = new ArrayList<>();
        mechanicsOfCar1.add(mechanic1);
        mechanicsOfCar1.add(mechanic2);
        List<Mechanics> mechanicsOfCar2 = new ArrayList<>();
        mechanicsOfCar2.add(mechanic1);
        List<Mechanics> mechanicsOfCar3 = new ArrayList<>();
        mechanicsOfCar3.add(mechanic3);
        List<Mechanics> mechanicsOfCar4 = new ArrayList<>();
        mechanicsOfCar4.add(mechanic4);
        List<Mechanics> mechanicsOfTruck1 = new ArrayList<>();
        mechanicsOfTruck1.add(mechanic2);
        mechanicsOfTruck1.add(mechanic5);
        List<Mechanics> mechanicsOfTruck2 = new ArrayList<>();
        mechanicsOfTruck2.add(mechanic3);
        List<Mechanics> mechanicsOfTruck3 = new ArrayList<>();
        mechanicsOfTruck3.add(mechanic3);
        List<Mechanics> mechanicsOfTruck4 = new ArrayList<>();
        mechanicsOfTruck4.add(mechanic4);
        List<Mechanics> mechanicsOfBus1 = new ArrayList<>();
        mechanicsOfBus1.add(mechanic5);
        List<Mechanics> mechanicsOfBus2 = new ArrayList<>();
        mechanicsOfBus2.add(mechanic5);
        List<Mechanics> mechanicsOfBus3 = new ArrayList<>();
        mechanicsOfBus3.add(mechanic5);
        List<Mechanics> mechanicsOfBus4 = new ArrayList<>();
        mechanicsOfBus4.add(mechanic5);
        Map<Transport, List<Mechanics>> transportAndMechanics = new HashMap<>();
        transportAndMechanics.put(cars[0], mechanicsOfCar1);
        transportAndMechanics.put(cars[1], mechanicsOfCar2);
        transportAndMechanics.put(cars[2], mechanicsOfCar3);
        transportAndMechanics.put(cars[3], mechanicsOfCar4);
        transportAndMechanics.put(trucks[0], mechanicsOfTruck1);
        transportAndMechanics.put(trucks[1], mechanicsOfTruck2);
        transportAndMechanics.put(trucks[2], mechanicsOfTruck3);
        transportAndMechanics.put(trucks[3], mechanicsOfTruck4);
        transportAndMechanics.put(bus[0], mechanicsOfBus1);
        transportAndMechanics.put(bus[1], mechanicsOfBus2);
        transportAndMechanics.put(bus[2], mechanicsOfBus3);
        transportAndMechanics.put(bus[3], mechanicsOfBus4);

        for (Map.Entry<Transport, List<Mechanics>> vehicle :
                transportAndMechanics.entrySet()) {
            System.out.println("Автомобиль " + vehicle.getKey() + " - Механик(и) " + vehicle.getValue());
        }





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
    public static void showDriverAndMechanics(Transport transport) {
        System.out.println("Водитель авто " +
                transport.getBrand() +
                " " + transport.getModel() +
                ": " + transport.getDriver().getName() +
                ", механик(и): " + transport.getPerson());
    }




}
