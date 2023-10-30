class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

    public int distanceTravelled;
    public int numberOfVictories;

    public void drive() {
        distanceTravelled += 10;
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

    @Override
    public int compareTo(ProductionRemoteControlCar other) {
        return this.numberOfVictories - other.getNumberOfVictories();
    }
}
