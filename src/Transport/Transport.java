package Transport;

public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private  double engineVolume;
    private T driver;

    public Transport(String brand,
                     String model,
                     double engineVolume,T driver) {
        if(brand==null||brand.isEmpty()){
            brand="default";
        }
        this.brand=brand;
        if(model==null||model.isEmpty()){
            model="default";
        }
        this.model=model;
        setEngineVolume(engineVolume);
        setDriver(driver);



    }

    public String getBrand(){
        return  brand;}

    public String getModel(){
        return model;}

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if(engineVolume<0){
            engineVolume=1.6;
        }

        this.engineVolume = engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public abstract void starMove();
    public abstract void finishMove();




    @Override
    public String toString() {
        return "Марка  '" + brand + '\'' +
                ", Модель  '" + model + '\'' +
                ", объем двигателя  " + engineVolume+
                ", водитель " + driver;
    }
}






