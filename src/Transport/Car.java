package Transport;

public class Car extends Transport<DriverB> {
    private String bodyType;
    public Car(String brand, String model, double engineVolume, DriverB driver, String bodyType) {
        super(brand, model, engineVolume, driver);
        this.bodyType=bodyType;
    }

    @Override
    public String toString() {
        return getBrand() + ", " + getModel() + ", " + getEngineVolume() + ", Тип Кузова - " + getBodyType() + getDriver().toString();
    }

    @Override
    public void starMove() {
        System.out.println(" Автомобиль марки " + getBrand()+" начал движение ");
    }

    @Override
    public void finishMove() {
        System.out.println(" Автомобиль марки " + getBrand()+" закончил движение ");
    }

    @Override
    public void pitStop() {
        System.out.println(" Пит-стоп у автомобиля  ");
    }

    @Override
    public void theBestCircleTime() {
        int minBound=70;
        int maxBound=120;
        int theBestTimeInMins=(int) (minBound+(maxBound-minBound)*Math.random());
        System.out.println(" Лучшее время круга у автомобиля в минутах " + theBestTimeInMins);
    }

    @Override
    public void maxSpeed() {
        int minBound=100;
        int maxBound=160;
        int maxSpeed=(int) (minBound+(maxBound-minBound)*Math.random());
        System.out.println(" Максимальная скорость  у автомобиля  " + maxSpeed);
    }
    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public boolean passDiagnostic(){
        return isDiagnosticPassed();

    }
}
