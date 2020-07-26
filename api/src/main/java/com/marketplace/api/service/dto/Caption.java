package com.marketplace.api.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Caption {
    @JsonProperty("kicker_badge")
    private KickerBadge kickerbadge;
    @JsonProperty("message")
    private String message;
}
