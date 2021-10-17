package com.miu.restuarant.repository;

import com.miu.restuarant.model.FoodInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FoodInfoRepository  extends MongoRepository<FoodInfo, Integer> {
}
