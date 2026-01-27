# Báo cáo thực hành môn Kiểm Thử Phần Mềm 

**Họ và tên:** Nguyễn Tuấn Hưng  
**Mã sinh viên:** BIT230186  
**Lớp:** 23IT-SOFT2  
**Email:** hungnn91296@gmail.com

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
