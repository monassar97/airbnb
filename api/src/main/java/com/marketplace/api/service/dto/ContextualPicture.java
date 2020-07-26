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
public class ContextualPicture {
    @JsonProperty("id")
    private String id;
    @JsonProperty("picture")
    private String picture;
    @JsonProperty("caption")
    private Caption caption;
}
