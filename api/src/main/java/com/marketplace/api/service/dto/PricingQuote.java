package com.marketplace.api.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PricingQuote {
    @JsonProperty("can_instant_book")
    private String canInstantBook;
    @JsonProperty("monthly_price_factor")
    private int monthlyPriceFactor;
    @JsonProperty("price")
    private Price price;
    @JsonProperty("price_string")
    private String priceString;
    @JsonProperty("rate")
    private Total rate;
    @JsonProperty("rate_type")
    private String rateType;
    @JsonProperty("rate_with_service_fee")
    private Total rateWithServiceFee;
    @JsonProperty("weekly_price_factor")
    private int weeklyPriceFactor;
    @JsonProperty("display_rate_display_strategy")
    private String shouldShowFromLabel;
    @JsonProperty("china_promotion_display_types")
    private List<String> chinaPromotionDisplayTypes;
}
