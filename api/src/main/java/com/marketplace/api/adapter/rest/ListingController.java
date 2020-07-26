package com.marketplace.api.adapter.rest;

import com.marketplace.api.service.ItemClient;
import com.marketplace.api.service.dto.ListRoot;
import com.marketplace.api.service.dto.ListingDetailsDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/listing")
public class ListingController {

    private final ItemClient itemClient;

    public ListingController(ItemClient itemClient) {
        this.itemClient = itemClient;
    }

    @GetMapping
    public ListRoot getResult(
            @RequestHeader("x-rapidapi-host") String host,
            @RequestHeader("x-rapidapi-key") String key) {
        return itemClient.getListings(host, key);
    }
}
