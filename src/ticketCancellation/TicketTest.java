package ticketCancellation;

import java.util.Date;

public class TicketTest {

    public static void main(String[] args) {

           CancellationPolicy cancellationPolicy = new RedBus();
                Date bookingDate=new Date(System.currentTimeMillis()+2*24*60*60*1000);
                Date cancellationDate=new Date(System.currentTimeMillis()+24*60*60*1000);
                Ticket ticket=new Ticket(500,bookingDate);
        cancellationPolicy.ticketCancellation(ticket,cancellationDate);
            }
}
