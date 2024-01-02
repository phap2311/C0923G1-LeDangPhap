drop database if exists book_manage;
create database if not exists book_manage;

use book_manage;

CREATE TABLE book_info (
    id_sach INT PRIMARY KEY AUTO_INCREMENT,
    ma_san_pham VARCHAR(100),
    gia DOUBLE,
    so_luong INT,
    hinh_anh TEXT,
    mo_ta TEXT,
    id_the_loai INT,
    id_tac_gia INT
);
-- 1Trinh thám,
-- 13:Harper Lee 
-- 14:Franz Kafka 
-- 15:J.D. Salinger 
-- 16:Fyodor Dostoevsky 
-- 2:Kinh điển
-- 17:- Dan Brown
-- 18:Thomas Harris
-- 19:Lôi Mễ
-- 20:Edgar Wallace
-- 3. self help
-- 21:Anthony Robbins
-- 22:Mark Manson 
-- 23:Robin Sharma
-- 24:Rhonda Byrne 

insert into book_info(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('GIẾT CON CHIM NHẠI',96000,30,'https://icdn.dantri.com.vn/a3HWDOlTcvMNT73KRccc/Image/2014/07/45-8768d.jpg','Giết con chim nhại” vừa ấm áp, hài hước, vừa dữ dội, thấm thía.
Nó đề cập tới những vấn đề nghiệt ngã của đời sống xã hội, như nạn phân biệt chủng tộc, tội ác, trừng phạt, sự bất công, lẽ công bằng…
Đây là cuốn tiểu thuyết được tìm đọc nhiều nhất, gây ảnh hưởng và có tiếng vang lớn nhất khi đề cập tới nạn phân biệt chủng tộc từng một thời diễn ra trên khắp nước Mỹ. 
Để hiểu được sự bất công, độc ác của con người và cũng để tìm được niềm tin vào những điều tốt đẹp trong cuộc sống, “Giết con chim nhại” là lựa chọn hoàn hảo.
“Phần lớn mọi người đều tốt cả, con ạ, chỉ có điều con chưa nhận ra đấy thôi”, câu nói của vị luật sư ngay thẳng, của người cha nhân hậu Atticus đã từng làm xúc động biết bao trái tim độc giả khi khép lại trang cuối cùng của cuốn tiểu thuyết.
',1,13);

insert into book_info(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('VỤ ÁN',144000,25,'https://icdn.dantri.com.vn/a3HWDOlTcvMNT73KRccc/Image/2014/07/46-8768d.jpg','Vụ án” là một trong những 
tác phẩm nổi tiếng nhất của Kafka. Cuốn tiểu thuyết kể về một người đàn ông bị bắt và bị khởi tố bởi một thứ chính quyền, tòa án và luật pháp kỳ lạ, 
không thể hiểu nổi. Bản thân tội ác mà nhân vật nam chính phạm phải (nếu có) cũng không được hé lộ cho chính anh ta và độc giả được biết.
Toàn bộ câu chuyện diễn ra vừa hiện thực vừa hư ảo như thể một cơn ác mộng, hư hư thực thực và đầy rẫy kinh hoàng, trong đó nhân vật chính bất lực hoàn toàn, 
chẳng có chút sức mạnh hay bất cứ một đầu mối nào để có thể thoát ra khỏi tấn bi kịch hãi hùng đã bóp chết anh ta.
Giống như phần lớn những tác phẩm khác của mình, tiểu thuyết này của Kafka cũng chưa được hoàn thành, tạo nên sự không liền mạch, 
thậm chí mâu thuẫn trong cốt truyện. Điều đó càng làm nổi bật lên chủ nghĩa hiện sinh trong tác phẩm, nhấn mạnh sự mất định hướng 
khi đứng trước một thế giới có vẻ như vô nghĩa và phi lý.',1,14);

insert into book_info(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('BẮT TRẺ ĐỒNG XANH',79200,15,'https://icdn.dantri.com.vn/a3HWDOlTcvMNT73KRccc/Image/2014/07/47-8768d.jpg','Cuốn tiểu thuyết “Bắt trẻ đồng xanh” ban đầu được 
tác giả J.D. Salinger viết cho người lớn, tuy vậy, về sau, cuốn tiểu thuyết này lại trở nên nổi tiếng và rất được giới thanh thiếu niên ưa thích bởi chủ đề của nó 
xoay quanh sự nổi loạn và nét tâm lý thách thức rất đặc trưng ở tuổi trẻ.
Nhân vật chính của tiểu thuyết - cậu thanh niên Holden Caulfield - đã trở thành biểu tượng cho sự phản kháng thường thấy ở những con người trẻ tuổi mới chập chững bước vào cuộc đời. 
Truyện đã khai thác rất sâu kỹ tâm lý và những vấn đề phức tạp ở lứa tuổi này: cá tính riêng, sự phức tạp của những mối quan hệ, cảm giác gắn bó và sự xa cách…
',1,15);

insert into book_info(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('ANH EM NHÀ KARAMAZOV',174000,20,'https://icdn.dantri.com.vn/a3HWDOlTcvMNT73KRccc/Image/2014/07/48-8768d.jpg','Đây là cuốn tiểu thuyết cuối cùng của Dostoevsky. Ông đã dành ra gần 2 năm để viết nên tác phẩm này - một cuốn tiểu thuyết đậm chất triết lý, lấy bối cảnh nước Nga ở thế kỷ 19. Tiểu thuyết đi sâu khai thác đề tài đạo đức, luân lý, tù ngục và sự tự do trong lý tưởng.
“Anh em nhà Karamazov” chứa đựng những cuộc đấu tranh của đạo đức trong đó đức tin, sự ngờ vực và lẽ phải đối diện với sự đổi thay của thời thế, trước một nước Nga đang dần chuyển mình. Cho tới tận hôm nay, cuốn tiểu thuyết này vẫn là một trong những tác phẩm văn học kinh điển, một trong những thành tựu lớn lao nhất của nền văn học thế giới.
',1,16);

insert into book_info(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('HỎA NGỤC',11000,10,'https://sachhay24h.com/uploads/images/hoa-nguc-dan-brown.jpg','Nhắc đến những cuốn tiểu thuyết trinh thám nổi tiếng trên thế giới, chắc chắn chúng ta không thể bỏ qua một tác phẩm cực kì nổi tiếng đó là Hoả Ngục của nhà văn người Mỹ Dan Brown.
Được xuất bản vào năm 2013, Hỏa ngục đã thực sự tạo được dấu ấn sâu sắc trong lòng độc giả và trở thành một trong những cuốn tiểu thuyết bán chạy nhất trên danh sách New York Times Best Seller. 
Tác phẩm ngay từ khi xuất bản đã thu về doanh thu rất cao, cũng như được dịch ra nhiều thứ tiếng khác nhau trên thế giới. Đồng thời, tác phẩm cũng được chuyển thể thành phim và dự kiến chiếu vào tháng 4 năm 2016.
Nhắc đến những cuốn tiểu thuyết trinh thám nổi tiếng trên thế giới, chắc chắn chúng ta không thể bỏ qua một tác phẩm cực kì nổi tiếng đó là Hoả Ngục của nhà văn người Mỹ Dan Brown.
Được xuất bản vào năm 2013, Hỏa ngục đã thực sự tạo được dấu ấn sâu sắc trong lòng độc giả và trở thành một trong những cuốn tiểu thuyết bán chạy nhất trên danh sách New York Times Best Seller. 
Tác phẩm ngay từ khi xuất bản đã thu về doanh thu rất cao, cũng như được dịch ra nhiều thứ tiếng khác nhau trên thế giới. 
Đồng thời, tác phẩm cũng được chuyển thể thành phim và dự kiến chiếu vào tháng 4 năm 2016.
',2,17);

insert into book_info(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('SỰ IM LẶNG CỦA BẦY CỪU ',172000,30,'https://sachhay24h.com/uploads/images/2020/T5/469/su-im-lang-cua-bay-cuu.PNG',
'Nếu bạn là một người yêu thích tiểu thuyết trinh thám thì chắc chắn không thể bỏ qua được tiểu thuyết Sự im lặng của bầy cừu của Thomas Harris. 
Đây là một tác phẩm trinh thám xen lẫn yếu tố kinh dị, với việc miêu tả tâm lí nhân vật hết sức tinh tế cùng những tình tiết truyện gay cấn và hồi hộp, cuốn tiểu thuyết đã  tạo ấn tượng rất đặc biệt trong lòng người đọc.
Sự im lặng của bầy cừu là câu chuyện đầy gay cấn và hấp dẫn kể về hàng loạt vụ án giết người xảy ra nhưng không để lại bất kỳ một dấu vết gì. 
Tuy nhiên có một bác sĩ tâm lý bị tâm thần có tên là Lecter lại rõ về hành vi của kẻ sát nhân nhưng không hiểu sao ông chỉ im lặng. 
Cuối cùng thì sự thật cũng đã phơi bày,  thủ phạm của hàng loạt vụ án giết người là một tên có nhân cách bệnh hoạn, một kẻ tâm thần vô cùng nguy hiểm
',2,18);

insert into book_info(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('ĐỀ THI ĐẪM MÁU',14000,30,'https://sachhay24h.com/uploads/images/2019/11/1/25/de-thi-dam-mau-1_600x877.jpg',
'Với những vụ án rùng rợn, kinh dị và khủng khiếp qua ngòi bút sắc bén của tác giả Lôi Mễ, “Đề thi đẫm máu” đã trở thành một trong những cuốn tiểu thuyết trinh thám nổi tiếng nhất trên thế giới thu hút được sự quan tâm của hàng triệu độc giả.
Ám ảnh, sợ hãi và bất ngờ, đó là những gì gói gọn trong tác phẩm trinh thám Đề thi đẫm máu nổi tiếng của tác giả Lôi Mễ. Những vụ án ly kì, hậu quả cực kì nghiêm trọng; tên sát nhân với thủ đoạn tàn nhẫn, giết người ghê rợn đều được thể hiện hết sức sinh động qua ngòi bút sắc bén của Lôi Mễ. 
Nội dung cuốn tiểu thuyết kể về nhân vật chính là một chàng trai vô cùng thông minh có tên là Phương Mộc. 
Anh chàng này có khả năng thiên bẩm là khắc họa chân dung tội phạm rất chính xác nên giúp đỡ cảnh sát nhiều trong việc phá án những vụ án giết người nguy hiểm. 
Rồi có những sự việc gì xảy ra tiếp theo, tại sao thầy giáo Tôn, người đã ra đề thi đẫm máu và nước mắt cho anh và những người thân bên cạnh anh lần lượt ra đi. 
Hãy theo dõi cuốn sách để tìm hiểu sự thật đằng sau những cái chết bí hiểm đó nhé.
Vốn là một sĩ quan cảnh sát, thế nên cách phát triển tâm lí tội phạm, cách miêu tả những tình tiết trong các vụ án đều được Lôi Mễ diễn tả một cách vô cùng chân thực và logic. Các sự việc xâu chuỗi vào nhau, tạo nên mạch truyện rất hợp lí. Gấp lại trang cuối cùng, chắc chắn đọng lại trong chúng ta không những là cảm giác ám ảnh về những vụ án khủng khiếp, mà còn là những trăn trở, suy nghĩ về tâm lí nhân vật, về những triết lí sống mà cuốn tiểu thuyết trinh thám đặc sắc này đã để lại.
',2,19);

insert into book_info(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('VÒNG TRÒN MÁU ',115000,25,'https://sachhay24h.com/uploads/images/tieu-thuyet-trinh-tham-vong-tron-mau.jpg',
'Vòng tròn máu là một trong những tiểu thuyết xuất sắc làm nên tên tuổi của Edgar Wallace. 
Xuất bản năm 1922, ngay lập tức tiểu thuyết trinh thám “Vòng tròn máu” đã tạo nên tiếng vang lớn tại Châu Âu, mở đường cho tác giả của nó - nhà văn Edgar Wallace, trở thành một trong những tác giả có số lượng ấn phẩm được bán nhiều nhất trên thế giới, với hơn 200 triệu bản.
Triệu phú James Beaardmore nhận được thư tống tiền từ tổ chức VÒNG TRÒN MÁU nhưng ông vẫn cương quyết không chịu nhượng bộ, dù đó là "lời cảnh cáo cuối cùng". 
Ngày hôm sau, ông bị sát hại ngay sau nhà. Bầu không khí hoang mang bao trùm khắp nước Anh, khi ngày càng có nhiều người thuộc tầng lớp thượng lưu giàu có lần lượt nhận được những lá thư đóng dấu tròn đỏ với cùng một yêu cầu: NỘP NGƯỜI HAY NỘP MẠNG. Cảnh sát bắt đầu vào cuộc điều tra, tìm ra manh mối của VÒNG TRÒN MÁU.
Bên cạnh các yếu tố li kì, hấp dẫn với nhịp chuyện dồn dập diễn ra liên tục cùng với tiết tấu truyện nhanh giúp độc giả cảm giác hồi hộp, gay cấn trong cuộc đối đầu giữa cảnh sát với trùm cuối của Vòng tròn máu. 
Wallace đã xây dựng một hệ thống nhân vật với cá tính riêng chỉ qua một vài chi tiết, hành động mà không sa đà quá vào cá nhân dẫn tới xao lãng mạch phá án chính. Đặc biệt phần cuối, twist hay nhất trong cả câu chuyện, nó đánh lạc hướng hoàn toàn dẫn dắt từ ban đầu của tác giả. Vòng tròn máu là tiểu thuyết trinh thám nổi tiếng bậc nhất của Edgar Wallace và đã 4 lần được dựng thành phim.
',2,20);

insert into book_info(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('ĐÁNH THỨC CON NGƯỜI PHI THƯỜNG TRONG BẠN',20000,30,'https://images.toplist.vn/images/800px/danh-thuc-con-nguoi-phi-thuong-trong-ban-706687.jpg',
'Cuốn sách “Đánh thức con người phi thường trong bạn” được viết bởi Anthony Robbins – một tác giả, diễn giả và nhà thiện nguyện nổi tiếng người Mỹ, xuất bản năm 1991. 
Tác phẩm hướng đến việc giúp người đọc khám phá và phát triển tiềm năng tiềm ẩn bên trong, nhằm xây dựng cuộc sống mơ ước. Với 26 chương, cuốn sách này được xây dựng 
dựa trên các phương pháp thực tế để làm chủ cảm xúc, quản lý mối quan hệ, quản lý tài chính và áp dụng các câu danh ngôn sâu sắc. Anthony Robbins 
tổng hợp những nghiên cứu và kinh nghiệm cá nhân của mình thành một hướng dẫn mạch lạc, giúp độc giả đạt được sự tự chủ và thành công trong mọi khía cạnh của cuộc sống.',3,21);

insert into book_info(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('NGHỆ THUẬT TINH TẾ CỦA VIỆC ĐẾCH QUAN TÂM CUỐN SÁCH ',150000,20,'https://salt.tikicdn.com/cache/750x750/ts/product/e4/9b/b7/a8b3f9dfdd6a8eef63f20b7646c976d8.jpg.webp',
'Nghệ thuật tinh tế của việc đếch quan tâm” của Mark Manson không hướng dẫn chúng ta cách đạt đến thành công như nhiều cuốn sách kỹ năng khác. 
Thay vào đó, tác giả tập trung vào việc giúp chúng ta học cách buông bỏ những thứ cần buông và tập trung quan tâm vào những điều quan trọng. 
Không phải “đếch quan tâm” đồng nghĩa với sự thờ ơ hay bỏ mặc mọi thứ. 
Thực tế, ý nghĩa ở đây là giữ cho tâm trạng bình thản, không mệt mỏi và chỉ quan tâm đến những điều có giá trị, hỗ trợ sự phát triển cá nhân..',3,22);

insert into book_info(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('ĐỜI NGẮN ĐỪNG NGỦ DÀI',195000,40,'https://jobsgo.vn/blog/wp-content/uploads/2023/11/Sach-Self-Help-La-Gi.jpg',
'Đây là một cuốn sách nổi tiếng của tác giả Robin Sharma. Cuốn sách này mang đến những chia sẻ sâu sắc về cách chúng ta có thể sống một cuộc sống đầy ý nghĩa và có ảnh hưởng tích cực đến thế giới xung quanh. 
“Đời ngắn đừng ngủ dài” không chỉ là một cuốn sách về làm giàu về mặt vật chất mà còn là hành trình để khám phá sứ mệnh cá nhân và định hình một cuộc sống có ý nghĩa. 
Cuốn sách xoay quanh các chủ đề như quản lý thời gian, xây dựng thói quen tích cực và khám phá đam mê cá nhân. 
Robin Sharma thường sử dụng lối viết lôi cuốn và ngôn ngữ đơn giản, giúp độc giả dễ dàng áp dụng những nguyên tắc này vào cuộc sống hàng ngày.',3,23);

insert into book_info(ma_san_pham, gia, so_luong, hinh_anh, mo_ta, id_the_loai, id_tac_gia)
values ('BÍ MẬT',166000,20,'https://jobsgo.vn/blog/wp-content/uploads/2023/11/sach-self-help-nen-doc.jpg',
'Cuốn sách “Bí mật” được xuất bản vào năm 2006 và nhanh chóng trở thành một tác phẩm nổi tiếng trong thể loại self help. 
Tác giả Rhonda Byrne chia sẻ về khái niệm “luật hấp dẫn” – một điều mà cô coi là bí mật của sự thành công. 
Theo quan điểm của Byrne, luật hấp dẫn không chỉ là một phát minh khoa học mà còn là một quy luật tinh tế trong cuộc sống. 
Cuốn sách khẳng định rằng những điều mà bạn tập trung vào sẽ trở thành hiện thực, dù đó là tích cực hay tiêu cực. 
Tác giả cũng nhấn mạnh rằng tiền bạc, hạnh phúc và sức khỏe có thể đạt được thông qua tư duy tích cực. 
“Bí mật” thúc đẩy độc giả luôn giữ tâm trạng lạc quan và tin rằng việc điều chỉnh vũ trụ với những mong muốn tích cực là chìa khóa cho cuộc sống hạnh phúc, thành công.',3,24);