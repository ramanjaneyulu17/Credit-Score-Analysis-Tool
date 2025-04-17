package com.developer.credit_score_service.controller;

import com.developer.credit_score_service.service.CreditScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditScoreController {

    @Autowired
    private CreditScoreService creditScoreService;
}
