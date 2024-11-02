package ticketCancellation;

import java.util.Date;

public interface CancellationPolicy {

    Double ticketCancellation(Ticket ticket, Date cancellationTime);

}
