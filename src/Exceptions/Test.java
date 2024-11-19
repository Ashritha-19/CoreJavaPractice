package Exceptions;

public class Test {
    public static void main(String[] args) {
        Account userAccount = new Account(1000);
        TicketBookingService bookingService = new TicketBookingService();

        try {
            System.out.println("Initial Balance: " + userAccount.getBalance());
            BookingStatusEnum status = bookingService.bookTicket(userAccount, 500);
            System.out.println("Booking Status: " + status);
        } catch (TicketBookingException e) {
            System.out.println("Booking process failed: " + e.getMessage());
        }

        System.out.println("Final Balance: " + userAccount.getBalance());
    }
}
