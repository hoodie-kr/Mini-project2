package com.aloha.kiosk.service.impl;

import com.aloha.kiosk.dto.Ramen;
import com.aloha.kiosk.mapper.RamenMapper;
import com.aloha.kiosk.service.RamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RamenServiceImpl implements RamenService {

    private final RamenMapper ramenMapper;

    @Autowired
    public RamenServiceImpl(RamenMapper ramenMapper) {
        this.ramenMapper = ramenMapper;
    }

    @Override
    public List<Ramen> getAllRamen() {
        return ramenMapper.findAll();
    }

    @Override
    public List<Ramen> getRamenByCategory(String category) {
        return ramenMapper.findByCategory(category);
    }
}