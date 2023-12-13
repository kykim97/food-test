package food.domain;

import food.domain.*;
import food.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryFinished extends AbstractEvent {

    private Long id;

    public DeliveryFinished(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryFinished() {
        super();
    }
}
//>>> DDD / Domain Event
