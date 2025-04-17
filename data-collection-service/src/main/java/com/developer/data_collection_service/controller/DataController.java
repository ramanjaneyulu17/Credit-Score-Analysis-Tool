package com.developer.data_collection_service.controller;

import com.developer.data_collection_service.repository.DataRepo;
import com.developer.data_collection_service.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("data")
public class DataController {

    @Autowired
    private DataService dataService;

    @GetMapping("{userId}")
    public ResponseEntity<String> retrieveAllFinancialData(@PathVariable Long userId){
        return dataService.retrieveAllFinancialData(userId);
    }
}
