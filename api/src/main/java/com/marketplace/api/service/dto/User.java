package com.marketplace.api.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("has_profile_pic")
    private boolean hasProfilePic;
    @JsonProperty("id")
    private long id;
    @JsonProperty("is_superhost")
    private boolean isSuperHoot;
    @JsonProperty("picture_url")
    private String pictureUrl;
    @JsonProperty("smart_name")
    private String smartName;
    @JsonProperty("thumbnail_url")
    private String thumbnailUrl;
}
