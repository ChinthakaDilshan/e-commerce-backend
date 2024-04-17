package org.eCommerce.service.impl;

import lombok.RequiredArgsConstructor;
import org.eCommerce.dto.ItemCategory;
import org.eCommerce.entity.ItemCategoryEntity;
import org.eCommerce.entity.ItemEntity;
import org.eCommerce.repository.ItemCategoryRepository;
import org.eCommerce.repository.ItemRepository;
import org.eCommerce.service.ItemCategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemCategoryServiceImpl implements ItemCategoryService {

    final ItemCategoryRepository repository;

    ModelMapper mapper;

    @Bean
    public void setupCategory(){this.mapper = new ModelMapper();}

    @Override
    public void addItemCategory(ItemCategory itemCategory) {
        ItemCategoryEntity entity = mapper.map(itemCategory, ItemCategoryEntity.class);
        repository.save(entity);
    }

    @Override
    public List<ItemCategoryEntity> getAllItemCategories() {
        return  (List<ItemCategoryEntity>) repository.findAll();
    }

    @Override
    public boolean deleteItemCategory(Long id) {
        if(repository.existsById(id)){
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
