package Transport;

public class Bus extends Transport{
    public Bus(String brand,
               String model,
               double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void starMove() {
        System.out.println(" Автобус марки " + getBrand()+" начал движение ");
    }

    @Override
    public void finishMove() {
        System.out.println(" Автобус марки " + getBrand()+" закончил движение ");
    }
}
