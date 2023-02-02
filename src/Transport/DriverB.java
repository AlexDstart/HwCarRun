package Transport;

public class DriverB extends Driver{
    public DriverB(String name, boolean hasDriverLicense,
                   int experienceInYears) {
        super(name, hasDriverLicense, experienceInYears);
    }

    @Override
    public void startMove() {
        System.out.println(" Водитель категории В " + getName()+ " Начал движение ");
    }

    @Override
    public void finishMove() {
        System.out.println(" Водитель категории В " + getName()+ " Закончил движение ");
    }

    @Override
    public void refill() {
        System.out.println(" Водитель категории В " + getName()+ " Заправил авто ");
    }
}
