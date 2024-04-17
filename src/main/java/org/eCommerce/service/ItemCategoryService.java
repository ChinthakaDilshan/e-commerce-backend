package org.eCommerce.service;

import org.eCommerce.dto.Item;
import org.eCommerce.dto.ItemCategory;
import org.eCommerce.entity.ItemCategoryEntity;
import org.eCommerce.entity.ItemEntity;

import java.util.List;

public interface ItemCategoryService {
    void addItemCategory(ItemCategory itemCategory);
    List<ItemCategoryEntity> getAllItemCategories();
    boolean deleteItemCategory(Long id);
}
