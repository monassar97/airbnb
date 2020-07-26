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
public class Picture {
    @JsonProperty("id")
    private long id;
    @JsonProperty("dominant_saturated_color")
    private String dominantSaturatedColor;
    @JsonProperty("large_ro")
    private String largeRo;
    @JsonProperty("picture")
    private String picture;
    @JsonProperty("preview_encoded_png")
    private String previewEncodedPng;
    @JsonProperty("saturated_a11y_dark_color")
    private String saturatedA11yDarkColor;
    @JsonProperty("scrim_color")
    private String scrimColor;
}
