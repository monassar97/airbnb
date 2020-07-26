package com.marketplace.api.service.dto;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PriceItem {
    @JsonProperty("localized_title")
    private String localizedTitle;
    @JsonProperty("price_items")
    private ArrayList<PriceItem> priceItems;
    @JsonProperty("total")
    private Total total;
    @JsonProperty("line_item_type")
    private int lineItemType;
    @JsonProperty("localized_explanation")
    private String localizedExplanation;

}