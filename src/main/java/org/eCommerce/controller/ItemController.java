package org.eCommerce.controller;

import lombok.RequiredArgsConstructor;
import org.eCommerce.dto.Item;
import org.eCommerce.entity.ItemEntity;
import org.eCommerce.service.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/item")
@RequiredArgsConstructor
public class ItemController {

    final ItemService service;

    @PostMapping("/add-item")
    @ResponseStatus(HttpStatus.CREATED)
    public void addItem(@RequestBody Item item){ service.addItem(item); }

    @GetMapping("/get-all-items")
    public List<ItemEntity> getAllItems(){
        return service.getAllItems();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteBorrower(@PathVariable Long id){
        return (service.deleteItem(id)) ?
                ResponseEntity.ok("Item Deleted Successfully...") :
                ResponseEntity.notFound().build();
    }

}
