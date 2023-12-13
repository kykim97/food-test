package food.domain;

import food.domain.*;
import food.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class CookLated extends AbstractEvent {

    private Long id;

    public CookLated(Cooking aggregate) {
        super(aggregate);
    }

    public CookLated() {
        super();
    }
}
//>>> DDD / Domain Event
