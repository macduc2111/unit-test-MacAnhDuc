package com.example.demo;

import java.util.List;

public class StudentAnalyzer {
    /**
     * Đếm số học sinh có điểm >= 8.0 (loại Giỏi).
     * Bỏ qua các điểm không hợp lệ (ví dụ: < 0 hoặc > 10).
     *
     * @param scores danh sách điểm của học sinh
     * @return số học sinh đạt loại Giỏi
     */
    public int countExcellentStudents(List<Double> scores) {
        if (scores == null || scores.isEmpty())
            return 0;

        int count = 0;
        for (Double score : scores) {
            if (score >= 8.0 && score <= 10) { // Rút gọn điều kiện
                count++;
            }
        }
        return count;
    }

    /**
     * Tính trung bình các điểm hợp lệ (0 <= điểm <= 10).
     * Bỏ qua điểm không hợp lệ trong danh sách.
     *
     * @param scores danh sách điểm của học sinh
     * @return điểm trung bình các điểm hợp lệ, hoặc 0 nếu không có điểm hợp lệ
     */
    public double calculateValidAverage(List<Double> scores) {
        if (scores == null || scores.isEmpty())
            return 0;

        double total = 0;
        int validCount = 0;

        for (Double score : scores) {
            if (score >= 0 && score <= 10) {
                total += score;
                validCount++;
            }
        }

        return validCount == 0 ? 0 : total / validCount;
    }
}
