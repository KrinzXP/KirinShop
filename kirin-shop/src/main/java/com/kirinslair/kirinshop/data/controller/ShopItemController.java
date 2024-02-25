package com.kirinslair.kirinshop.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kirinslair.kirinshop.data.model.dto.ShopItemsDto;
import com.kirinslair.kirinshop.data.model.entity.ShopItems;
import com.kirinslair.kirinshop.data.service.ShopItemServices;



@Controller
@RequestMapping(path = "{$apiPrefix}/items")
public class ShopItemController {
    
    @Autowired
    private ShopItemServices shopItemServices;

    @GetMapping("/all")
    public List<ShopItems> getAllItems() {
        return shopItemServices.getAllItems();
    }

    @PostMapping("/new")
    public ShopItems saveItem(@RequestBody ShopItemsDto shopItem) {
        return shopItemServices.saveItems(shopItem);
    }

    @PutMapping("/update/{itemId}")
    public ShopItems updateItem(@RequestBody ShopItems shopItem, @PathVariable String itemId) {
        return shopItemServices.updateItems(shopItem, itemId);
    }
    
    
}
