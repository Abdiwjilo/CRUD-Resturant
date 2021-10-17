package com.miu.restuarant.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.miu.restuarant.model.RestuarantInfo;
public interface RestuarantInfoRepository extends MongoRepository<RestuarantInfo, Integer> {
}
