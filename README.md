# RMI-kthdv

Sử dụng Java RMI viết ứng dụng client-server đơn giản sau. Server có một danh sách sinh viên. Thông tin về sinh viên gồm có Họ tên, MSSV, lớp, điện thoại, email, địa chỉ. Client nhận MSSV được nhập bởi người dùng và gửi sang cho server. Server tìm trong danh sách và trả về cho cient thông tin của sinh viên có MSSV tương ứng. Client in thông tin sinh viên ra màn hình.  

Chú ý:

- Làm theo nhóm

- Nộp mã nguồn và báo cáo đơn giản chứa thông tin về nhóm và ảnh chụp màn hình thể hiện ứng dụng đã hoạt động.


Hướng dẫn:

chạy javac 2 file ClientOperation và ServerOperation để biên dịch

register RMI qua lệnh start rmiregistry
chạy lần lượt java Server Operation và java ClientOperation trên 2 terminal khác nhau để nhận kết quả
