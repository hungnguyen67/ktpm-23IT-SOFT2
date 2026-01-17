# Báo cáo thực hành môn Kiểm Thử Phần Mềm 

**Họ và tên:** Nguyễn Tuấn Hưng  
**Mã sinh viên:** BIT230186
**Lớp:** 23IT-SOFT2
**Email:** hungnn91296@gmail.com

## Tuần 1 - Trải nghiệm chất lượng giao diện người dùng

### Nhiệm vụ: Chơi game tại https://cantunsee.space/
- Mục tiêu: Chọn thiết kế "đúng" / "chuẩn" hơn trong các cặp ảnh UI/UX, rèn luyện sự chú ý đến chi tiết pixel-perfect (khoảng cách, căn chỉnh, font-weight, border-radius, v.v.)
- Đây là game rất nổi tiếng để giúp lập trình viên front-end "rên rỉ" vì những sai lệch nhỏ xíu trong thiết kế.

### Kết quả của tôi
- Điểm số đạt được: 8130
- Thời gian: 03 phút 31 giây
- Screenshot kết quả :

![Kết quả Can't Unsee - Hưng](images/cantunsee-ketqua.png)

## Tuần 2 - Bài Tập Thực Hành Kiểm Thử Với JUnit

## Chủ Đề: Phân Tích Dữ Liệu Điểm Số Học Sinh

### Mục Tiêu Học Tập
- Biết cách viết kiểm thử tự động bằng JUnit.
- Biết cách khai thác AI tạo sinh để hỗ trợ lập trình.

## Mô Tả Yêu Cầu Chức Năng

Chương trình Java có lớp `StudentAnalyzer` chứa hai phương thức:

1. `countExcellentStudents(List<Double> scores)`: Trả về số lượng học sinh đạt loại Giỏi (>= 8.0), bỏ qua điểm không hợp lệ (< 0 hoặc > 10), trả về 0 nếu danh sách rỗng.

2. `calculateValidAverage(List<Double> scores)`: Tính điểm trung bình của các điểm hợp lệ (từ 0 đến 10), bỏ qua điểm không hợp lệ.

## Yêu Cầu Kỹ Thuật
- Validate điểm: bỏ qua nếu < 0 hoặc > 10.
- Xử lý danh sách rỗng: trả về 0.
- Duyệt danh sách để lọc và tính toán.

## Cách Chạy Chương Trình và Kiểm Thử

### Yêu Cầu Hệ Thống
- Java 11 hoặc cao hơn
- Maven 3.6+

### Cài Đặt và Chạy
1. Clone hoặc tải về project.
2. Mở terminal và điều hướng đến thư mục `unit-test`.
3. Chạy lệnh: `mvn clean compile`
4. Để chạy kiểm thử: `mvn test`

### Kết Quả Kiểm Thử
Tất cả 13 test case đã pass:
- Trường hợp bình thường
- Trường hợp biên (danh sách trống, giá trị biên)
- Trường hợp ngoại lệ (điểm không hợp lệ)

## Cấu Trúc Project
```
unit-test/
├── pom.xml
├── src/
│   ├── main/java/
│   │   └── StudentAnalyzer.java
│   └── test/java/
│       └── StudentAnalyzerTest.java
└── README.md
```

## Tài Liệu Tham Khảo
- [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)
- [Maven Documentation](https://maven.apache.org/guides/)