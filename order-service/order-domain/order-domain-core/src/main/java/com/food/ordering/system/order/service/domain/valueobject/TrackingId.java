package com.food.ordering.system.order.service.domain.valueobject;

import com.food.ordering.system.valueobject.BaseId;

import java.util.UUID;

public class TrackingId extends BaseId<UUID> {
    public TrackingId(UUID id) {
        super(id);
    }
}
