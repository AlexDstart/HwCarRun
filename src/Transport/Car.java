package Transport;

public class Car extends Transport {
    public Car(String brand,
               String model,
               double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void starMove() {
        System.out.println(" Автомобиль марки " + getBrand()+" начал движение ");
    }

    @Override
    public void finishMove() {
        System.out.println(" Автомобиль марки " + getBrand()+" закончил движение ");
    }
}
