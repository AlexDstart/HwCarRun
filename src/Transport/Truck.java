package Transport;

public class Truck extends Transport<DriverC>{

    public double truckCapacity1;
    public Truck(String brand, String model, double engineVolume, DriverC driver,TruckCapacity truckCapacity1) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void starMove() {
        System.out.println(" Грузовик марки " + getBrand()+" начал движение ");
    }

    @Override
    public void finishMove() {
        System.out.println(" Грузовик марки " + getBrand()+" закончил движение ");

    }

    @Override
    public boolean isDiagnosticPassed() {
        return false;
    }

    @Override
    public void pitStop() {
        System.out.println(" Пит-стоп у грузовика  ");
    }

    @Override
    public void theBestCircleTime() {
        int minBound=90;
        int maxBound=140;
        int theBestTimeInMins=(int) (minBound+(maxBound-minBound)*Math.random());
        System.out.println(" Лучшее время круга у грузовика в минутах " + theBestTimeInMins);
    }

    @Override
    public void maxSpeed() {
        int minBound=90;
        int maxBound=130;
        int maxSpeed=(int) (minBound+(maxBound-minBound)*Math.random());
        System.out.println(" Максимальная скорость  у грузовика  " + maxSpeed);
    }
    public String toString() {
        return ""+ getBrand()+getModel()+getEngineVolume()+getDriver().toString();
    }

    @Override
    public boolean passDiagnostics() {
        System.out.println("Грузовой автомобиль "+getBrand()+", "+getModel()+" прошел диагностику");
        return true;
    }
}
