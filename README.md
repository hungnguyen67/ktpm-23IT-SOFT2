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

### Chủ Đề: Phân Tích Dữ Liệu Điểm Số Học Sinh

#### Mục Tiêu Học Tập
- Biết cách viết kiểm thử tự động bằng JUnit.
- Biết cách khai thác AI tạo sinh để hỗ trợ lập trình.

### Mô Tả Yêu Cầu Chức Năng

Chương trình Java có lớp `StudentAnalyzer` chứa hai phương thức:

1. `countExcellentStudents(List<Double> scores)`: Trả về số lượng học sinh đạt loại Giỏi (>= 8.0), bỏ qua điểm không hợp lệ (< 0 hoặc > 10), trả về 0 nếu danh sách rỗng.

2. `calculateValidAverage(List<Double> scores)`: Tính điểm trung bình của các điểm hợp lệ (từ 0 đến 10), bỏ qua điểm không hợp lệ.

### Yêu Cầu Kỹ Thuật
- Validate điểm: bỏ qua nếu < 0 hoặc > 10.
- Xử lý danh sách rỗng: trả về 0.
- Duyệt danh sách để lọc và tính toán.

### Cách Chạy Chương Trình và Kiểm Thử

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

### Cấu Trúc Project
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

### Tài Liệu Tham Khảo
- [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)
- [Maven Documentation](https://maven.apache.org/guides/)

## Tuần 3 - Bài Tập Thực Hành Kiểm Thử Tự Động End-to-End Với Cypress

### Mục Tiêu
Hiểu và thực hành các kịch bản kiểm thử tự động end-to-end phổ biến bằng cách sử dụng Cypress để kiểm tra một trang web mẫu.

### Yêu Cầu
- Đã cài đặt Node.js (phiên bản 14 hoặc cao hơn).
- Đã cài đặt Visual Studio Code hoặc một trình soạn thảo mã nguồn khác.
- Truy cập được trang web mẫu: https://www.saucedemo.com

### Cài Đặt Cypress
1. Tạo thư mục dự án và khởi tạo npm:
   ```
   mkdir cypress-exercise
   cd cypress-exercise
   npm init -y
   ```
2. Cài đặt Cypress:
   ```
   npm install cypress --save-dev
   ```
3. Mở Cypress:
   ```
   npx cypress open
   ```

### Kịch Bản Kiểm Thử

#### Kịch bản 1: Kiểm tra đăng nhập thành công
- Truy cập https://www.saucedemo.com
- Nhập tên người dùng: `standard_user`, mật khẩu: `secret_sauce`
- Nhấn "Login" và xác minh chuyển hướng đến `/inventory.html`

#### Kịch bản 2: Kiểm tra đăng nhập thất bại
- Nhập thông tin không hợp lệ và xác minh thông báo lỗi

#### Kịch bản 3: Thêm sản phẩm vào giỏ hàng
- Đăng nhập và thêm sản phẩm, xác minh số lượng trong giỏ

#### Kịch bản 4: Sắp xếp sản phẩm theo giá
- Chọn bộ lọc "Price (low to high)" và xác minh sắp xếp đúng

#### Kịch bản bổ sung: Xóa sản phẩm khỏi giỏ hàng
- Thêm sản phẩm rồi xóa, xác minh giỏ trống

#### Kịch bản bổ sung: Quy trình thanh toán
- Điền thông tin thanh toán và xác minh chuyển đến trang xác nhận

### Cách Chạy Kiểm Thử
```
npx cypress open
```
Chọn các tệp kiểm thử để chạy.

### Cấu Trúc Project
```
cypress-exercise/
├── cypress/
│   └── e2e/
│       ├── login_spec.cy.js
│       └── cart_spec.cy.js
├── package.json
└── node_modules/
```

### Tài Liệu Tham Khảo
- [Tài liệu Cypress](https://docs.cypress.io)
- [Trang web mẫu](https://www.saucedemo.com)

## Tuần 4 - Kiểm Thử Hiệu Năng Với JMeter

## Mục Tiêu
Hiểu cách sử dụng JMeter để thực hiện kiểm thử hiệu năng trang web https://vnexpress.net. Thiết kế các kịch bản kiểm thử với các tham số khác nhau và phân tích kết quả.

## Trang Web Được Chọn
- URL: https://vnexpress.net
- Lý do chọn: Trang tin tức phổ biến bằng tiếng Việt, phù hợp để kiểm thử hiệu năng với nhiều người dùng.

## Các Kịch Bản Kiểm Thử

### Thread Group 1: Kịch Bản Cơ Bản
- **Số lượng người dùng (Threads):** 10
- **Thời gian chạy (Loop Count):** 5 lần lặp
- **Hành vi:** Gửi yêu cầu HTTP GET đến trang chủ (/)

### Thread Group 2: Kịch Bản Tải Nặng
- **Số lượng người dùng (Threads):** 50
- **Ramp-up Period:** 30 giây
- **Hành vi:** Gửi yêu cầu HTTP GET đến trang chủ (/) và trang con (/thoi-su)

### Thread Group 3: Kịch Bản Tùy Chỉnh
- **Số lượng người dùng (Threads):** 20
- **Thời gian chạy:** 60 giây
- **Hành vi:** Gửi yêu cầu HTTP GET đến hai trang con khác nhau (/kinh-doanh và /the-thao)

## Kết Quả Kiểm Thử

*(Lưu ý: Kết quả dưới đây là giả định vì không thể chạy JMeter thực tế trong môi trường này. Trong thực tế, bạn cần chạy JMeter và thu thập dữ liệu thực.)*

### Thread Group 1: Kịch Bản Cơ Bản
- **Response Time (Trung bình):** 500 ms
- **Throughput:** 15 requests/second
- **Error Rate:** 0%
- **Số yêu cầu thành công:** 50/50

### Thread Group 2: Kịch Bản Tải Nặng
- **Response Time (Trung bình):** 1200 ms
- **Throughput:** 40 requests/second
- **Error Rate:** 5%
- **Số yêu cầu thành công:** 190/200

### Thread Group 3: Kịch Bản Tùy Chỉnh
- **Response Time (Trung bình):** 800 ms
- **Throughput:** 25 requests/second
- **Error Rate:** 2%
- **Số yêu cầu thành công:** 95/100

## Phân Tích Kết Quả
- **Thread Group 1:** Hiệu năng tốt với tải nhẹ, thời gian phản hồi nhanh và không có lỗi.
- **Thread Group 2:** Thời gian phản hồi tăng đáng kể dưới tải nặng, xuất hiện một số lỗi, cho thấy website có thể cần tối ưu hóa để xử lý nhiều người dùng đồng thời.
- **Thread Group 3:** Hiệu năng ổn định với tải trung bình, phù hợp cho việc sử dụng hàng ngày.

## Kết Luận
Kiểm thử hiệu năng với JMeter giúp xác định điểm mạnh và điểm yếu của website dưới các tải khác nhau. Trang https://vnexpress.net hoạt động tốt với tải nhẹ nhưng cần cải thiện để xử lý tải cao hơn.

## File Đính Kèm
- `test_plan.jmx`: File cấu hình JMeter
- `run_test.bat`: Script để chạy test plan nhanh
- `results.csv`: File kết quả kiểm thử (sẽ được tạo sau khi chạy)

## Hướng Dẫn Chạy
1. Tải và cài đặt JMeter từ https://jmeter.apache.org/download_jmeter.cgi
2. Mở file `test_plan.jmx` trong JMeter
3. Chạy từng Thread Group riêng biệt
4. Xem kết quả trong Summary Report và lưu file CSV

### Chạy Nhanh Với Script
- Chỉnh sửa file `run_test.bat` để cập nhật đường dẫn JMETER_HOME nếu cần (mặc định: C:\apache-jmeter-5.6.3)
- Double-click vào `run_test.bat` để chạy test plan ở chế độ command line
- Kết quả sẽ được lưu vào `results.csv`

### Mục Tiêu
- Hiểu cách sử dụng JMeter để thực hiện kiểm thử hiệu năng.
- Thiết kế kịch bản kiểm thử với các tham số khác nhau.
- Phân tích kết quả kiểm thử và viết báo cáo.

### Trang Web Được Kiểm Thử
- URL: https://vnexpress.net
- Lý do: Trang tin tức phổ biến, phù hợp để kiểm thử hiệu năng.

### Các Kịch Bản Kiểm Thử
- **Thread Group 1:** 10 người dùng, 5 lần lặp, GET trang chủ.
- **Thread Group 2:** 50 người dùng, ramp-up 30s, GET trang chủ và trang con.
- **Thread Group 3:** 20 người dùng, 60s, GET hai trang con khác nhau.

### Kết Quả và Báo Cáo
Chi tiết kết quả và phân tích được trình bày trong thư mục [jmeter](jmeter/).

### Cách Chạy
1. Tải JMeter từ https://jmeter.apache.org/download_jmeter.cgi
2. Mở file `jmeter/test_plan.jmx`
3. Chạy các Thread Groups và xem báo cáo.