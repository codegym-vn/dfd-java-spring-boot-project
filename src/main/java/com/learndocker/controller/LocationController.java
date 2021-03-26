package com.learndocker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/locations")
public class LocationController {

    @GetMapping("")
    public ResponseEntity<String> getLocation() {
        return ResponseEntity.ok().body("Hello welcome to spring boot and docker!");
    }
}
