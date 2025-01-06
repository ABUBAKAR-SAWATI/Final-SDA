package Example.Controller;

class BookingController {
    private Customer customer;
    private Driver driver;
    private Car car;
    private BookingView view;

    BookingController(Customer customer, Driver driver, Car car, BookingView view) {
        this.customer = customer;
        this.driver = driver;
        this.car = car;
        this.view = view;
    }

    public void bookCar() {
        view.displayBookingDetails(customer.getCustomerName(), driver.getDriverName(), car.getCarName(), car.getCarModel());
    }
}
