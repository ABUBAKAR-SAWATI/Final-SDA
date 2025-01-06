package Example.Model;



class Car {
    private int carId;
    private String carName;
    private String carModel;

    Car(int carId, String carName, String carModel) {
        this.carId = carId;
        this.carName = carName;
        this.carModel = carModel;
    }

    public int getCarId() {
        return carId;
    }

    public String getCarName() {
        return carName;
    }

    public String getCarModel() {
        return carModel;
    }
}
