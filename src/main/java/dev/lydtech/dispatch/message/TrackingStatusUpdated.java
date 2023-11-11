package dev.lydtech.dispatch.message;

import dev.lydtech.tracking.service.TrackingStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrackingStatusUpdated {
    UUID orderId;
    TrackingStatus trackingStatus;
}