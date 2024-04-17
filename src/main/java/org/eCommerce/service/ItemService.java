package org.eCommerce.service;

import org.eCommerce.dto.Item;
import org.eCommerce.entity.ItemEntity;

import java.util.List;

public interface ItemService {
    void addItem(Item item);
    List<ItemEntity> getAllItems();
    boolean deleteItem(Long id);

}
