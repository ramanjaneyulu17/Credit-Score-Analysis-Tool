package com.developer.credit_score_service.service;

import com.developer.credit_score_service.repository.CreditScoreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditScoreService {

    @Autowired
    private CreditScoreRepo creditScoreRepo;
}
