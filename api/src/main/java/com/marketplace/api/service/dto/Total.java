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
public class Total {
    @JsonProperty("amount")
    private int amount;
    @JsonProperty("amount_formatted")
    private String amountFormatted;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("is_micros_accuracy")
    private boolean isMicrosAccuracy;
}
