package com.marketplace.api.service;

import com.marketplace.api.service.dto.ListRoot;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(url = "https://airbnb-com.p.rapidapi.com/listings", name = "itemService")
public interface ItemClient {

    @Headers("Content-Type: application/json")
    @GetMapping(value = "/nearby/37.788719679657554/-122.40057774847898?min_bathrooms=0&check_out=2021-02-26&hotel_room=false&max_guests=1&check_in=2021-02-25&private_room=false&min_bedrooms=0&offset=0&entire_home=false&min_price=0&max_price=5000&min_beds=0&radius=5&shared_room=false")
    ListRoot getListings(@RequestHeader("x-rapidapi-host") String host, @RequestHeader("x-rapidapi-key") String key);
}
