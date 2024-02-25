package com.kirinslair.kirinshop.data.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kirinslair.kirinshop.data.model.entity.ShopItems;

@Repository
public interface ShopItemRepository extends JpaRepository<ShopItems, UUID>{
    
}
