package ticketCancellation;

public enum TicketEnum {

    FULL_REFUND(1.0),
    HALF_REFUND(0.5),
    NO_REFUND(0.0);

    private final double refundAmt;

    TicketEnum(double refundAmt){
       this.refundAmt = refundAmt;
   }

    public double getRefundAmt() {
        return refundAmt;
    }


}
