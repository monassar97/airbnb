package com.marketplace.api.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListingDetailsDto {
    @JsonProperty("listing")
    private Listing listing;
    @JsonProperty("pricing_quote")
    private PricingQuote pricingQuote;
    @JsonProperty("verified_card")
    private String verifiedCard;
}
