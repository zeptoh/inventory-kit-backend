package com.clevermoe.inventory.repository;

import com.clevermoe.inventory.model.ShippingOption;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ShippingOptionRepository extends MongoRepository<ShippingOption, String> {
    List<ShippingOption> findByNameAndAddressZone(String name, String addressZone);
}
