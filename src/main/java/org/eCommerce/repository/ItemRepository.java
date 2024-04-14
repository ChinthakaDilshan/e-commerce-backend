package org.eCommerce.repository;

import org.eCommerce.entity.ItemEntity;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<ItemEntity,Long> {
}
