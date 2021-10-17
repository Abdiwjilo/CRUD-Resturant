package com.miu.restuarant.resource;

import com.miu.restuarant.model.FoodInfo;
import com.miu.restuarant.repository.FoodInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FoodInfoController {
    @Autowired
    private FoodInfoRepository repository;

    @PostMapping("/addfoodInfo")
    public String saverestuarantInfo(@RequestBody FoodInfo foodInfo) {
        repository.save(foodInfo);
        return "Added FoodInfo with id : " + getfoodInfo(foodInfo.getId());
    }

    @GetMapping("/findAllfoodInfos")
    public List<FoodInfo> getfoodInfo() {
        return repository.findAll();
    }

    @GetMapping("/findAllfoodInfo/{id}")
    public Optional<FoodInfo> getfoodInfo(@PathVariable int id) {
        return repository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deletefoodInfo(@PathVariable int id) {
        repository.deleteById(id);
        return "foodInfo deleted with id : " + id;
    }
}
