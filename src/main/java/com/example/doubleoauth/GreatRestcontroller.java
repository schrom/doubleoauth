package com.example.doubleoauth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Set;

@RestController
public class GreatRestcontroller {

    @GetMapping("/api/call")
    public Map<String, Object> apiCall(){
        return Map.of("superSecreatApi", "You should not see me without a valid token!");
    }
}
