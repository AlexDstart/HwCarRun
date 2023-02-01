package Transport;

public class Truck extends Transport{
    public Truck(String brand,
                 String model,
                 double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void starMove() {
        System.out.println(" Грузовик марки " + getBrand()+" начал движение ");
    }

    @Override
    public void finishMove() {
        System.out.println(" Грузовик марки " + getBrand()+" закончил движение ");

    }
}
