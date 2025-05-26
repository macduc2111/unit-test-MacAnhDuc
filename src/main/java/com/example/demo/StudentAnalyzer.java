package com.example.demo;

import java.util.List;

public class StudentAnalyzer {
    public int countExcellentStudents(List<Double> scores) {
        if (scores == null || scores.isEmpty())
            return 0;

        int count = 0;
        for (Double score : scores) {
            if (score != null && score >= 0 && score <= 10 && score >= 8.0) {
                count++;
            }
        }
        return count;
    }

    public double calculateValidAverage(List<Double> scores) {
        if (scores == null || scores.isEmpty())
            return 0;

        double total = 0;
        int validCount = 0;

        for (Double score : scores) {
            if (score != null && score >= 0 && score <= 10) {
                total += score;
                validCount++;
            }
        }

        return validCount == 0 ? 0 : total / validCount;
    }
}