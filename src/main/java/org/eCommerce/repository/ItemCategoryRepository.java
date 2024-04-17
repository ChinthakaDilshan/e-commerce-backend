package org.eCommerce.repository;

import org.eCommerce.entity.ItemCategoryEntity;
import org.springframework.data.repository.CrudRepository;

public interface ItemCategoryRepository extends CrudRepository<ItemCategoryEntity,Long> {
}
