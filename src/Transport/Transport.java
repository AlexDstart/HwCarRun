package Transport;

import Transport.servicies.Mechanics;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private  double engineVolume;
    private T driver;
    private List<Mechanics> person;

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
        this.person = new ArrayList<>();



    }

    public String getBrand(){
        return  brand;}

    public String getModel(){
        return model;}

    public List<Mechanics> getPerson() {
        return person;
    }

    public void setPerson(Mechanics mechanic) {
        this.person.add(mechanic);
    }

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

    public abstract void isDiagnosticPassed();

    public void diagnoseVehicle() throws TransportTypeException {};





    @Override
    public String toString() {
        return "Марка  '" + brand + '\'' +
                ", Модель  '" + model + '\'' +
                ", объем двигателя  " + engineVolume+
                ", водитель " + driver;
    }
}






