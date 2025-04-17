package com.developer.credit_score_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "credit_scores")
public class CreditScore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long creditScoreId;
    private Long userId;
    private Integer score;
    private LocalDate date;
    private String scoreType;

    @Column(columnDefinition = "JSON")
    private String scoreHistory;

    private String algorithmUsed;
}
