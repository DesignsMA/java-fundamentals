class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    static final int SPEED = 10;
    private int distanceTravelled;
    public int numberOfVictories;

    public void drive() {
        distanceTravelled+=SPEED;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    public int compareTo(ProductionRemoteControlCar other)
    {
        if (other == null)
        {
            throw new NullPointerException("Cannot compare with null");
        }

        return Integer.compare(other.numberOfVictories, this.numberOfVictories);
    } 
}
