package com.marketplace.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Property {
    private String city;
    private String address;
    private String name;
    private List<String> pictures;
    private String bathroomLabel;
    private String bedroomLabel;
    private String bedLabel;
    private String amenities;
    private double avgRating;
    private double price;
    private String currency;
}
