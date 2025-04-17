package com.developer.report_service.service;

import com.developer.report_service.repository.ReportRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

    @Autowired
    private ReportRepo reportRepo;
}
