package com.developer.data_collection_service.repository;

import com.developer.data_collection_service.model.FinancialRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepo extends JpaRepository<FinancialRecord, Long> {
}
