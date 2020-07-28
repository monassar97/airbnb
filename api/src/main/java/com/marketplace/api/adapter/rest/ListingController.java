package com.marketplace.api.adapter.rest;

import com.marketplace.api.model.PropertiesResponse;
import com.marketplace.api.service.ItemClient;
import com.marketplace.api.service.ItemService;
import com.marketplace.api.service.dto.ListRoot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/listing")
public class ListingController {

    private final ItemService itemService;

    public ListingController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public PropertiesResponse getResult(
            @RequestHeader("x-rapidapi-host") String host,
            @RequestHeader("x-rapidapi-key") String key) {
        return itemService.getProperties(host, key);
    }
}
