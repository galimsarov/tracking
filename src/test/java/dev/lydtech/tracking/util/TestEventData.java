package dev.lydtech.tracking.util;

import dev.lydtech.dispatch.message.DispatchPreparing;

import java.util.UUID;

public class TestEventData {
    public static DispatchPreparing buildDispatchTrackingEvent(UUID orderId) {
        return DispatchPreparing.builder()
                .orderId(orderId)
                .build();
    }
}