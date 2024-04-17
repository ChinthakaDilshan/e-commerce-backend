package org.eCommerce.service.impl;

import lombok.RequiredArgsConstructor;
import org.eCommerce.dto.Item;
import org.eCommerce.entity.ItemEntity;
import org.eCommerce.repository.ItemRepository;
import org.eCommerce.service.ItemService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    final ItemRepository repository;

    ModelMapper mapper;

    @Bean
    public void setup(){this.mapper = new ModelMapper();}
    @Override
    public void addItem(Item item) {
        ItemEntity entity = mapper.map(item, ItemEntity.class);
        repository.save(entity);
    }

    @Override
    public List<ItemEntity> getAllItems() {
        return  (List<ItemEntity>) repository.findAll();
    }

    @Override
    public boolean deleteItem(Long id) {
        if(repository.existsById(id)){
            repository.deleteById(id);
            return true;
        }
        return false;
    }


}
