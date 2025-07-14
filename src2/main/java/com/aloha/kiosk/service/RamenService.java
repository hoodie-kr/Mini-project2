package com.aloha.kiosk.service;

import com.aloha.kiosk.dto.Ramen;
import java.util.List;

public interface RamenService {
    List<Ramen> getAllRamen();
    List<Ramen> getRamenByCategory(String category);
}