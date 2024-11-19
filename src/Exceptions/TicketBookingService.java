package Exceptions;

public class TicketBookingService {
    private AccountService accountService = new AccountService();

    public BookingStatusEnum bookTicket(Account account, double ticketPrice) throws TicketBookingException {

        BookingStatusEnum status = BookingStatusEnum.PENDING;

        try {
            System.out.println("Payment successful. Proceeding with ticket booking...");

            if (true) {
                throw new TicketBookingException("Ticket booking failed due to network error.");
            }

        } catch (TicketBookingException e) {
            System.err.println("Error: " + e.getMessage());
            status = BookingStatusEnum.FAILED;
            throw e;
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
            status = BookingStatusEnum.FAILED;
        } finally {
            if (status == BookingStatusEnum.FAILED) {
                accountService.credit(account, ticketPrice);
                System.out.println("Money refunded due to booking failure.");
            }
        }

        return status;
    }
}

