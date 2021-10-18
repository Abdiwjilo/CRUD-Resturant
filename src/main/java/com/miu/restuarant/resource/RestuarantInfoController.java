package com.miu.restuarant.resource;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.miu.restuarant.model.RestuarantInfo;
import com.miu.restuarant.repository.RestuarantInfoRepository;

@RestController
public class RestuarantInfoController {

    @Autowired
    private RestuarantInfoRepository repository;

    @PostMapping("/addrestuarantInfo")
    public String saverestuarantInfo(@RequestBody RestuarantInfo restuarantInfo) {
        repository.save(restuarantInfo);
        return "Added restuarantInfo with id : " + getrestuarantInfo(restuarantInfo.getId());
    }

    @GetMapping("/findAllrestuarantInfos")
    public List<RestuarantInfo> getrestuarantInfo() {
        return repository.findAll();
    }

    @GetMapping("/findAllrestuarantInfo/{id}")
    public Optional<RestuarantInfo> getrestuarantInfo(@PathVariable int id) {
        return repository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleterestuarantInfo(@PathVariable int id) {
        repository.deleteById(id);
        return "restuarantInfo deleted with id : " + id;
    }

}
