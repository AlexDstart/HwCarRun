package Transport;

public enum TruckCapacity {
    N1(1.0,3.5),
    N2(3.6,12),
    N3(12,500);

    private double min;
    private double max;

    TruckCapacity(double min, double max) {
        this.min = min;
        this.max = max;
    }

    public static TruckCapacity getValue(double value) {
        for (TruckCapacity e : TruckCapacity.values()) {
            if (value >= e.getMin() && value <= e.getMax()) {
                System.out.println("значение = " + e);
                return e;
            }
        }return null;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    @Override
    public String toString() {
        return "Грузоподъемность от "+ min +" до " + max;
    }
}
