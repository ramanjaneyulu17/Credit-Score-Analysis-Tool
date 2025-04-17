package com.developer.credit_score_service.repository;

import com.developer.credit_score_service.model.CreditScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditScoreRepo extends JpaRepository<CreditScore, Long> {
}
