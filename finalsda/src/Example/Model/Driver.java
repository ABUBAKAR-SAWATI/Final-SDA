package Example.Model;

class Driver {
    private int driverId;
    private String driverName;
    private String phone;

    Driver(int driverId, String driverName, String phone) {
        this.driverId = driverId;
        this.driverName = driverName;
        this.phone = phone;
    }

    public int getDriverId() {
        return driverId;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getPhone() {
        return phone;
    }
}
