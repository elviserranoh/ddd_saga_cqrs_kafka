package com.food.ordering.system.valueobject;

import java.util.UUID;

public class RestaurantId extends BaseId<UUID> {
    public RestaurantId(UUID id) {
        super(id);
    }
}
