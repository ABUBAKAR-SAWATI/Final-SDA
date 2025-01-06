package Example.View;

class BookingView {
    public void displayBookingDetails(String customerName, String driverName, String carName, String carModel) {
        System.out.println("\n--- Booking Details ---");
        System.out.println("Customer: " + customerName);
        System.out.println("Driver: " + driverName);
        System.out.println("Car: " + carName + " (" + carModel + ")");
    }
}
