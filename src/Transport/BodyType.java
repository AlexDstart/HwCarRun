package Transport;

public enum BodyType {
    SEDAN("Седан"),
    HATCHBACK("Хетчбэк"),
    COUPE("Купе"),
    UNIVERSAL("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");


    public   String nameCar;
    BodyType(String nameCar) {
        this.nameCar = nameCar;
    }


    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    @Override
    public String toString() {
        return ", тип кузова :" + getNameCar();
    }

}
