package com.marketplace.api.service;

import com.marketplace.api.service.dto.ListRoot;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(url = "https://airbnb-com.p.rapidapi.com/listings", name = "itemService")
public interface ItemClient {

    @Headers("Content-Type: application/json")
    @GetMapping(value = "/nearby/37.788719679657554/-122.40057774847898")
    ListRoot getListings(@RequestHeader("x-rapidapi-host") String host, @RequestHeader("x-rapidapi-key") String key);
}
