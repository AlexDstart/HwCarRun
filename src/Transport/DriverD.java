package Transport;

public class DriverD extends Driver{
    public DriverD(String name, boolean hasDriverLicense, int experienceInYears) {
        super(name, hasDriverLicense, experienceInYears);
    }


    @Override
    public void startMove() {
        System.out.println(" Водитель категории D " + getName()+ " Начал движение ");
    }

    @Override
    public void finishMove() {
        System.out.println(" Водитель категории D " + getName()+ " Закончил движение ");
    }

    @Override
    public void refill() {
        System.out.println(" Водитель категории D " + getName()+ " Заправил авто ");
    }
}
