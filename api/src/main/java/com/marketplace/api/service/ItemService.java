package com.marketplace.api.service;

import com.marketplace.api.model.PropertiesResponse;
import com.marketplace.api.model.Property;
import com.marketplace.api.service.dto.ListRoot;
import com.marketplace.api.service.dto.ListingDetailsDto;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemService {
    private final ItemClient itemClient;

    public ItemService(ItemClient itemClient) {
        this.itemClient = itemClient;
    }

    public PropertiesResponse getProperties(String host,String key){
        ListRoot listRoot = itemClient.getListings(host, key);
        return maoToPropertiesResponse(listRoot);
    }

    private PropertiesResponse maoToPropertiesResponse(ListRoot listRoot){
        int total = listRoot.getTotal();
        List<Property> properties = listRoot.getListings().stream()
                .map(p -> mapToProperty(p))
                .collect(Collectors.toList());
        return PropertiesResponse.builder()
                .totalProperties(total)
                .properties(properties)
                .build();
    }

    private Property mapToProperty(ListingDetailsDto dto){
        return Property.builder()
                .city(dto.getListing().getCity())
                .address(dto.getListing().getPublicAddress())
                .name(dto.getListing().getName())
                .pictures(dto.getListing().getPicture_urls())
                .bathroomLabel(dto.getListing().getBathroomLabel())
                .bedroomLabel(dto.getListing().getBedRoomLabel())
                .bedLabel(dto.getListing().getBedLabel())
                .amenities(dto.getListing().getPreviewAmenities())
                .avgRating(dto.getListing().getAvgRating())
                .price(dto.getPricingQuote().getRate().getAmount())
                .currency(dto.getPricingQuote().getRate().getCurrency())
                .build();
    }

}
