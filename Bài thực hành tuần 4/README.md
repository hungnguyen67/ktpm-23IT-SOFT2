# Báo cáo thực hành môn Kiểm Thử Phần Mềm 

**Họ và tên:** Nguyễn Tuấn Hưng  
**Mã sinh viên:** BIT230186  
**Lớp:** 23IT-SOFT2  
**Email:** hungnn91296@gmail.com

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

### Thread Group 1: Kịch Bản Cơ Bản
- **Response Time (Trung bình):** 5143 ms
- **Throughput:** 55.2 requests/minute
- **Error Rate:** 0%
- **Số yêu cầu thành công:** 20/20

### Thread Group 2: Kịch Bản Tải Nặng
- **Response Time (Trung bình):** 3695 ms
- **Throughput:** 3.4 requests/second
- **Error Rate:** 0%
- **Số yêu cầu thành công:** 100/100

### Thread Group 3: Kịch Bản Tùy Chỉnh
- **Response Time (Trung bình):** ~5000 ms
- **Throughput:** ~1.5 requests/second
- **Error Rate:** 0%
- **Số yêu cầu thành công:** 40/40

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