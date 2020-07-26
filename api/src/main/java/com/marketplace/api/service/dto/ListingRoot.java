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
public class ListingRoot {
    @JsonProperty("listing")
    private Listing listing;
    @JsonProperty("pricing_quote")
    private PricingQuote pricingQuote;
    @JsonProperty("verified_card")
    private String verifiedCard;
}
