package com.marketplace.api.service.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Coordinate {
    private double latitude;
    private double longitude;
}
