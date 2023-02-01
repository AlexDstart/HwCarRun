import Transport.Car;
import Transport.Bus;
import Transport.Truck;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            Car car = new Car("Car brand № "+i,
                    "Car model № " +i,
                    1.6);
                Truck truck = new Truck("Truck brand № "+ i,
                        "Truck model №"+ i,
                        4.5);
                    Bus bus = new Bus("Bus brand № "+ i,
                            "Bus model № "+ i,
                            4.0);

            System.out.println(car);
            System.out.println(truck);
            System.out.println(bus);


                }
            }
        }


