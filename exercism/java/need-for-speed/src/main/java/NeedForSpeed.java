class NeedForSpeed {
    private int battery = 100;
    private final int speed;
    private final int batteryDrain;
    private int distanceDriven;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return battery < batteryDrain;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (!batteryDrained())
        {
            distanceDriven += speed;
            battery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }

    public int getSpeed()
    {
        return speed;
    }

    public int getBatteryDrain()
    {
        return batteryDrain;
    }

    public int getBattery()
    {
        return battery;
    }
}

class RaceTrack {
    private final int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return ((float)distance/car.getSpeed())*car.getBatteryDrain() <= car.getBattery();
    }
}
