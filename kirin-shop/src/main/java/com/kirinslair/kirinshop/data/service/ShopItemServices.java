package com.kirinslair.kirinshop.data.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kirinslair.kirinshop.data.repository.ShopItemRepository;
import com.kirinslair.kirinshop.data.model.dto.ShopItemsDto;
import com.kirinslair.kirinshop.data.model.entity.ShopItems;

@Service
public class ShopItemServices {
    
    @Autowired
    private ShopItemRepository shopItemRepository;

    public List<ShopItems> getAllItems() {
        return shopItemRepository.findAll();
    }

    public ShopItems saveItems(ShopItemsDto shopItems) {
        ShopItems item = dtoConverter(shopItems);
        shopItemRepository.save(item);
        return item;
    }

    public ShopItems updateItems(ShopItems shopItem, String itemId) {
        try {
            ShopItems foundItem;
            UUID uuid = UUID.fromString(itemId);
            Optional<ShopItems> itemOptional = shopItemRepository.findById(uuid);
            if (itemOptional.isPresent()) {
                foundItem = itemOptional.get();
                foundItem.setItemName(shopItem.getItemName());
                foundItem.setDescription(shopItem.getDescription());
                foundItem.setPrice(shopItem.getPrice());
                foundItem.setType(shopItem.getType());
                foundItem.setBrand(shopItem.getBrand());
                foundItem.setQuantity(shopItem.getQuantity());
                shopItemRepository.save(foundItem);
                return foundItem;
            } else {
                throw new IOException("Item Not Found");   
            }    
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        return null;
    }

    private ShopItems dtoConverter(ShopItemsDto dto) {
        ShopItems shopItem = new ShopItems();
        shopItem.setItemName(dto.getItemName());
        shopItem.setDescription(dto.getDescription());
        shopItem.setQuantity(dto.getQuantity());
        shopItem.setPrice(dto.getPrice());
        shopItem.setType(dto.getType());
        shopItem.setBrand(dto.getBrand());
        return shopItem;
    }
}
