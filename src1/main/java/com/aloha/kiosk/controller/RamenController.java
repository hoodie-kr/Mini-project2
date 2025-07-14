package com.aloha.kiosk.controller;

import com.aloha.kiosk.dto.Ramen;
import com.aloha.kiosk.service.RamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ramen")
public class RamenController {

    private final RamenService ramenService;

    @Autowired
    public RamenController(RamenService ramenService) {
        this.ramenService = ramenService;
    }

    @GetMapping
    public List<Ramen> getAllRamen() {
        return ramenService.getAllRamen();
    }

    @GetMapping("/{category}")
    public List<Ramen> getByCategory(@PathVariable String category) {
        return ramenService.getRamenByCategory(category);
    }
}