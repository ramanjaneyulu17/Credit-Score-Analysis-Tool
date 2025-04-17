package com.developer.data_collection_service.service;

import com.developer.data_collection_service.repository.DataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DataService {

    @Autowired
    private DataRepo dataRepo;

    public ResponseEntity<String> retrieveAllFinancialData(Long userId) {
        return new ResponseEntity<>("all data", HttpStatus.OK);
    }
}
