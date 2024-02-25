package com.kirinslair.kirinshop.data.model.dto;

import java.math.BigInteger;
import java.util.UUID;

public class ShopItemsDto {
    
    private UUID itemId;
    private String itemName;
    private String description;
    private Integer quantity;
    private BigInteger price;
    private String type;
    private String brand;

    public ShopItemsDto(UUID itemId, String itemName, String description, Integer quantity, BigInteger price,
    String type, String brand) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.type = type;
        this.brand = brand;
    }

    public ShopItemsDto(String itemName, String description, Integer quantity, BigInteger price,
            String type, String brand) {
        this.itemName = itemName;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.type = type;
        this.brand = brand;
    }

    

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UUID getItemId() {
        return itemId;
    }

    public void setItemId(UUID itemId) {
        this.itemId = itemId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    



    
    
}