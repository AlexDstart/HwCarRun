import Transport.*;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            DriverB driverB=new DriverB(" Driver cat.B ",
                    true,
                    5+i);
            DriverC driverC=new DriverC(" Driver cat.C ",
                    true,
                    7+i);
            DriverD driverD=new DriverD(" Driver cat.D ",
                    true,
                    10+i);

            Car car = new Car(" Car brand № "+i,
                    " Car model № " +i,
                    1.6,driverB);

                Truck truck = new Truck(" Truck brand № "+ i,
                        "Truck model №"+ i,
                        4.5,driverC);
                    Bus bus = new Bus(" Bus brand № "+ i,
                            "Bus model № "+ i,
                            4.0,driverD);
            printInfo(car);
            printInfo(bus);
            printInfo(truck);
                }
            }
            private static void printInfo(Transport<?> transport){
                System.out.println(" Водитель"+transport.getDriver().getName() + " управляет автомобилем "+ transport.getBrand()+" и будет участвовать в заезде ");

            }
        }


