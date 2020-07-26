package com.marketplace.api.service.dto;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Listing {
    @JsonProperty("bathroom_label")
    private String bathroomLabel;
    @JsonProperty("bathrooms")
    private int bathrooms;
    @JsonProperty("bed_label")
    private String bedLabel;
    @JsonProperty("bedroom_label")
    private String bedRoomLabel;
    @JsonProperty("bedrooms")
    private int bedrooms;
    @JsonProperty("beds")
    private int beds;
    @JsonProperty("city")
    private String city;
    @JsonProperty("guest_label")
    private String guestLabel;
    private ArrayList<String> host_languages;
    @JsonProperty("host_thumbnail_url_small")
    private String hostThumbnailUrlSmall;
    @JsonProperty("host_thumbnail_url")
    private String hostThumbnailUrl;
    @JsonProperty("id")
    private int id;
    @JsonProperty("is_business_travel_ready")
    private boolean isBusinessTravelReady;
    @JsonProperty("is_new_listing")
    private boolean isNewListing;
    @JsonProperty("is_superhost")
    private boolean isSuperHost;
    @JsonProperty("lat")
    private int lat;
    @JsonProperty("lng")
    private int lng;
    @JsonProperty("localized_city")
    private String localizedCity;
    @JsonProperty("localized_neighborhood")
    private String localizedNeighborHood;
    @JsonProperty("name")
    private String name;
    @JsonProperty("neighborhood")
    private String neighborHood;
    @JsonProperty("person_capacity")
    private int personCapacity;
    @JsonProperty("picture_count")
    private int pictureCount;
    @JsonProperty("picture_url")
    private String pictureUrl;
    private ArrayList<String> picture_urls;
    @JsonProperty("picture")
    private Picture picture;
    @JsonProperty("preview_amenities")
    private String previewAmenities;
    @JsonProperty("preview_encoded_png")
    private String previewEncodedPng;
    @JsonProperty("property_type_id")
    private int propertyTypeId;
    @JsonProperty("reviews_count")
    private int reviewsCount;
    @JsonProperty("room_and_property_type")
    private String roomAndPropertyType;
    @JsonProperty("room_type_category")
    private String roomTypeCategory;
    @JsonProperty("room_type")
    private String roomType;
    @JsonProperty("scrim_color")
    private String scrimColor;
    @JsonProperty("show_structured_name")
    private boolean showStructuredName;
    @JsonProperty("space_type")
    private String spaceType;
    @JsonProperty("star_rating")
    private int starRating;
    @JsonProperty("tier_id")
    private int tierId;
    @JsonProperty("user")
    private User user;
    @JsonProperty("public_address")
    private String publicAddress;
    private ArrayList<Integer> amenity_ids;
    private ArrayList<String> preview_amenity_names;
    private ArrayList<String> reviews;
    private ArrayList<String> preview_tags;
    @JsonProperty("avg_rating")
    private double avgRating;
    @JsonProperty("map_highlight_status")
    private String mapHighlightStatus;
    @JsonProperty("license")
    private String license;
    @JsonProperty("min_nights")
    private int minNights;
    @JsonProperty("max_nights")
    private int maxNights;
    private ArrayList<ContextualPicture> contextual_pictures;
    @JsonProperty("pdp_type")
    private String pdpType;
    @JsonProperty("pdp_url_type")
    private String pdpUrlType;
    private ArrayList<String> extend_cards;
    private ArrayList<Integer> picture_ids;
    @JsonProperty("cancel_policy")
    private String cancelPolicy;
    private ArrayList<String> pdp_display_extensions;
    @JsonProperty("coordinate")
    private Coordinate coordinate;

}
