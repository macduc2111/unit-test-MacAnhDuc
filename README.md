#  Unit Test - Phân tích điểm số học sinh

###  Họ và tên: Mạc Anh Đức
###  MSSV: BIT220221

---

##  Mô tả bài toán

Bài tập yêu cầu xây dựng một chương trình Java với lớp `StudentAnalyzer` thực hiện hai chức năng chính:

1. **Đếm số lượng học sinh đạt loại Giỏi**:
   - Một học sinh được xem là *Giỏi* nếu điểm số của họ **≥ 8.0**.
   - Bỏ qua các điểm không hợp lệ (âm hoặc lớn hơn 10).
   - Nếu danh sách điểm trống hoặc null → trả về 0.

2. **Tính điểm trung bình hợp lệ**:
   - Chỉ tính trung bình cộng của các điểm hợp lệ (0 ≤ điểm ≤ 10).
   - Nếu không có điểm hợp lệ → trả về 0.

---


##  Các trường hợp kiểm thử đã thực hiện

1. Danh sách chứa điểm hợp lệ và không hợp lệ.
2. Danh sách trống.
3. Danh sách chỉ toàn điểm hợp lệ.
4. Danh sách chỉ toàn điểm không hợp lệ.
5. Trường hợp biên: điểm = 0.0 và 10.0.
6. Trường hợp đặc biệt: danh sách là `null`.

---

##  Các hàm được kiểm thử

### `countExcellentStudents(List<Double> scores)`

- Trả về số lượng học sinh có điểm từ **8.0 đến 10.0**.
- Bỏ qua các điểm không hợp lệ (âm hoặc > 10).
- Trả về `0` nếu danh sách `null` hoặc rỗng.

### `calculateValidAverage(List<Double> scores)`

- Tính trung bình cộng của các điểm hợp lệ (**0.0 ≤ điểm ≤ 10.0**).
- Bỏ qua các điểm không hợp lệ.
- Trả về `0` nếu không có điểm hợp lệ.

---

## Kết quả đo bao phủ kiểm thử


###  Kết quả đo thực tế:

| Lớp              | Dòng được kiểm thử | Tổng số dòng | Bao phủ (%) |
|------------------|-------------------|---------------|-------------|
| StudentAnalyzer  | 28                | 28            |  100%      |

 Mọi nhánh điều kiện (`if`, `for`) đều đã được kiểm thử đầy đủ.


##  Đo bao phủ với JaCoCo (Tùy chọn nâng cao)

Dự án đã tích hợp plugin **JaCoCo** trong `pom.xml`.

### Cách sử dụng:

1. Mở Terminal tại thư mục gốc dự án.
2. Chạy lệnh:



