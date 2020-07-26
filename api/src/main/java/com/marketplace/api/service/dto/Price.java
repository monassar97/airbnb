package com.marketplace.api.service.dto;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Price {
    @JsonProperty("localized_title")
    private String localizedTitle;
    private ArrayList<PriceItem> price_items;
    @JsonProperty("total")
    private Total total;

}
