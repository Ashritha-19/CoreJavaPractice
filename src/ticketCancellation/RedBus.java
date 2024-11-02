package ticketCancellation;

import java.util.Date;

public class RedBus implements CancellationPolicy{

    private long dateToHours(Date startDate, Date endDate){
        long totalMilliSeconds = endDate.getTime()-startDate.getTime();
        long totalHours = totalMilliSeconds/(1000*60*60);
        return totalHours;
    }

    @Override
    public Double ticketCancellation(Ticket ticket, Date cancellationTime) {
       long cancellationHours = dateToHours(cancellationTime, ticket.getBookingDate());

       double refundAmt ;

       if (cancellationHours >= 48){
         refundAmt = ticket.getAmount() * TicketEnum.FULL_REFUND.getRefundAmt();
           System.out.println("RefundAmt "+ refundAmt);
       }
       if (cancellationHours >= 24){
           refundAmt = ticket.getAmount() * TicketEnum.HALF_REFUND.getRefundAmt();
           System.out.println("RefundAmt "+ refundAmt);
       }else {
            refundAmt = ticket.getAmount() * TicketEnum.NO_REFUND.getRefundAmt();
           System.out.println("RefundAmt "+ refundAmt);
       }
       return refundAmt;
    }
}
