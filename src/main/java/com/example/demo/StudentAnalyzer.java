package com.example.demo;

import java.util.List;

public class StudentAnalyzer {

    /**
     * Đếm số học sinh có điểm >= 8.0 (loại Giỏi), bỏ qua điểm không hợp lệ.
     */
    public int countExcellentStudents(List<Double> scores) {
        if (scores == null || scores.isEmpty())
            return 0;

        int count = 0;
        for (Double score : scores) {
            if (score >= 0 && score <= 10 && score >= 8.0) {
                count++;
            }
        }
        return count;
    }
}