package org.eCommerce.controller;

import lombok.RequiredArgsConstructor;
import org.eCommerce.dto.Item;
import org.eCommerce.dto.ItemCategory;
import org.eCommerce.entity.ItemCategoryEntity;
import org.eCommerce.entity.ItemEntity;
import org.eCommerce.service.ItemCategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/item-category")
@RequiredArgsConstructor
public class ItemCategoryController {

    final ItemCategoryService service;

    @PostMapping("/add-itemCategory")
    @ResponseStatus(HttpStatus.CREATED)
    public void addItem(@RequestBody ItemCategory itemCategory){ service.addItemCategory(itemCategory); }

    @GetMapping("/get-all-itemCategories")
    public List<ItemCategoryEntity> getAllItemCategories(){
        return service.getAllItemCategories();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteBorrower(@PathVariable Long id){
        return (service.deleteItemCategory(id)) ?
                ResponseEntity.ok("Item-Category Deleted Successfully...") :
                ResponseEntity.notFound().build();
    }

}
