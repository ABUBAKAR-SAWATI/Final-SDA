package Example;

import Example.Model.Car;
import Example.Model.Customer;
import Example.Model.Driver;
import Example.Model.BookingView;
import Example.Model.BooingController;


public class Main{
    public static void main(String[] args) {
        // Create Model Objects
        Customer customer = new Customer(1, "Ali Khan", "03211234567");
        Driver driver = new Driver(101, "Ahmed Raza", "03012345678");
        Car car = new Car(201, "Toyota Corolla", "2022");

        // Create View Object
        BookingView view = new BookingView();

        // Create Controller Object
        BookingController controller = new BookingController(customer, driver, car, view);

        // Perform Car Booking
        controller.bookCar();
    }
}