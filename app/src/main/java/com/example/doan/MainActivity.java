package com.example.doan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ImageButton bnthoc,bntbienbao,btnluat,btnthi,btngiaxe;
    dbhelper dbHelper;
    CarouselView carous ;
    cauhoi ch;
    ArrayList<cauhoi> listcauhoi = new ArrayList<cauhoi>();
    int[] hinh = new int[]{R.drawable.ad2,R.drawable.ad3,R.drawable.quangcao};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dbHelper = new dbhelper(MainActivity.this);
        dbHelper.createUserTable();
        ch = new cauhoi();
        listcauhoi.addAll(dbHelper.getUsers());
        if (listcauhoi.size()==0)
        {Themcauhoi();
        Themcauhoi2();
        Themcauhoi3();
        Themcauhoi4();}
        carous= findViewById(R.id.carousel);
        bnthoc= findViewById(R.id.imgbnthoc);
        btnthi=findViewById(R.id.thi);
        btngiaxe=findViewById(R.id.btngiaxe);
        bntbienbao= findViewById(R.id.imgbtnbienbao);
        btnluat=findViewById(R.id.tracuu);
        bnthoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Hoc.class);
                startActivity(intent);
            }
        });
        bntbienbao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,bienbao.class);
                startActivity(intent);
            }
        });
        btnluat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,luat.class);
                startActivity(intent);
            }
        });
        btnthi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,thi.class);
                startActivity(intent);
            }
        });
        carous.setPageCount(hinh.length);
        carous.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(hinh[position]);
            }
        });
        btngiaxe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,giaxe.class);
                startActivity(intent);
            }
        });






    }
    private void Themcauhoi2() {
        dbHelper.insertCauHoi(new cauhoi("Câu 11","“Phương tiện tham gia giao thông đường bộ” gồm những loại nào?","Phương tiện giao thông cơ giới đường bộ.","Phương tiện giao thông thô sơ đường bộ và xe máy chuyên dùng.\n","","","Phương tiện giao thông cơ giới đường bộ.",1,2,3,4,1));
        dbHelper.insertCauHoi(new cauhoi("Câu 12","“Người tham gia giao thông đường bộ” gồm những đối tượng nào?","Người điều khiển, người sử dụng phương tiện tham gia giao thông đường bộ.","Người điều khiển, dẫn dắt súc vật, người đi bộ trên đường bộ.","","","Người điều khiển, người sử dụng phương tiện tham gia giao thông đường bộ.",1,2,3,4,1));
        dbHelper.insertCauHoi(new cauhoi("Câu 13"," Khái niệm “người điều khiển giao thông” được hiểu như thế nào là đúng?","Là người điều khiển phương tiện tham gia giao thông.","Là người được giao nhiệm vụ hướng dẫn giao thông tại nơi thi công, nơi ùn tắc giao thông, ở bến phà, tại cầu đường bộ đi chung với đường sắt.","Là cảnh sát giao thông.","Tất cả các ý nêu trên","Là người được giao nhiệm vụ hướng dẫn giao thông tại nơi thi công, nơi ùn tắc giao thông, ở bến phà, tại cầu đường bộ đi chung với đường sắt.",1,2,3,4,2));
        dbHelper.insertCauHoi(new cauhoi("Câu 14","Hành vi nào ghi ở dưới đây bị nghiêm cấm?","Phá hoại đường, cầu, hầm, bến phà đường bộ, phá hoại đèn tín hiệu, cọc tiêu, biển báo hiệu, gương cầu, dải phân cách.","Phá hoại hệ thống thoát nước và các công trình, thiết bị khác thuộc kết cấu hạ tầng giao thông đường bộ.","","","Phá hoại đường, cầu, hầm, bến phà đường bộ, phá hoại đèn tín hiệu, cọc tiêu, biển báo hiệu, gương cầu, dải phân cách.",1,2,3,4,1));
        dbHelper.insertCauHoi(new cauhoi("Câu 15","Những hành vi nào ghi ở dưới đây bị nghiêm cấm?","Đua xe, cổ vũ đua xe, tổ chức đua xe trái phép.","Lạng lách, đánh võng.","","","Đua xe, cổ vũ đua xe, tổ chức đua xe trái phép.",1,2,3,4,1));
        dbHelper.insertCauHoi(new cauhoi("Câu 16","Người điều khiển phương tiện giao thông đường bộ mà trong cơ thể có chất ma túy có bị nghiêm cấm hay không?","Bị nghiêm cấm","Không bị nghiêm cấm.","","","Bị nghiêm cấm",1,2,3,4,1));
        dbHelper.insertCauHoi(new cauhoi("Câu 17","Người điều khiển xe ô tô, xe máy kéo, xe máy chuyên dùng trên đường mà trong máu hoặc hơi thở có nồng độ cồn vượt quá bao nhiêu thì bị cấm?","Người điều khiển xe ô tô, máy kéo, xe máy chuyên dùng mà trong máu có nồng độ cồn vượt quá 50 miligam/100 mililit máu hoặc 0.25 miligam/1 lit khí thở.","Người điều khiển xe ô tô, máy kéo, xe máy chuyên dùng trên đường mà trong máu hoặc hơi thở có nồng độ cồn.","Người điều khiển xe ô tô, máy kéo, xe máy chuyên dùng trên đường mà trong máu có nồng độ cồn vượt quá 80 miligam/100 mililit máu hoặc 40 miligam/1 lit khí thở.","","Người điều khiển xe ô tô, máy kéo, xe máy chuyên dùng trên đường mà trong máu hoặc hơi thở có nồng độ cồn.",1,2,3,4,2));
        dbHelper.insertCauHoi(new cauhoi("Câu 18","Người điều khiển xe mô tô, xe gắn máy trên đường mà trong máu có nồng độ cồn vượt quá bao nhiêu thì bị cấm?","Nồng độ cồn vượt quá 50 miligam/100 mililit máu.","Nồng độ cồn vượt quá 40 miligam/100 mililit máu.","Nồng độ cồn vượt quá 30 miligam/100 mililit máu","","Nồng độ cồn vượt quá 50 miligam/100 mililit máu.",1,2,3,4,1));
        dbHelper.insertCauHoi(new cauhoi("Câu 19","Người điều khiển xe mô tô, xe gắn máy trên đường mà trong khí thở có nồng độ cồn vượt quá bao nhiêu thì bị cấm ?","Nồng độ cồn vượt quá 0.25 miligam/1 lit khí thở.","Nồng độ cồn vượt quá 0.20 miligam/1 lit khí thở.","Nồng độ cồn vượt quá 0.15 miligam/1 lit khí thở.","","Nồng độ cồn vượt quá 0.25 miligam/1 lit khí thở.",1,2,3,4,1));
        dbHelper.insertCauHoi(new cauhoi("Câu 20"," Hành vi giao xe cơ giới, xe máy chuyên dùng cho người không đủ điều kiện để điều khiển xe tham gia giao thông có bị nghiêm cấm hay không?","Không bị nghiêm cấm.","Bị nghiêm cấm.","Nghiêm cấm tùy từng trường hợp.","","Bị nghiêm cấm.",1,2,3,4,2));

    }
    private void Themcauhoi3() {
        dbHelper.insertCauHoi(new cauhoi("Câu 21","Hành vi điều khiển xe cơ giới chạy quá tốc độ quy định, giành đường, vượt ẩu có bị nghiêm cấm hay không?\n" +
                "\n" +
                "Bị nghiêm cấm.","Bị nghiêm cấm.","Bị nghiêm cấm.","Nghiêm cấm tùy từng trường hợp.","","Bị nghiêm cấm.",1,2,3,4,1));
        dbHelper.insertCauHoi(new cauhoi("Câu 22"," Những hành vi nào sau đây bị cấm?","Bấm còi, rú ga liên tục, bấm còi trong thời gian từ 22 giờ đến 5 giờ.","Bấm còi hơi, sử dụng đèn chiếu xa trong khu đô thị và khu dân cư, trừ các xe ưu tiên khi đang làm nhiệm vụ.","","","Bấm còi, rú ga liên tục, bấm còi trong thời gian từ 22 giờ đến 5 giờ.",1,2,3,4,1));
        dbHelper.insertCauHoi(new cauhoi("Câu 23","Các hành vi nào sau đây bị nghiêm cấm?","Lắp đặt, sử dụng còi, đèn không đúng thiết kế của nhà sản xuất đối với từng loại xe cơ giới.","Sử dụng thiết bị âm thanh gây mất trật tự an toàn giao thông, trật tự công cộng.","","","Lắp đặt, sử dụng còi, đèn không đúng thiết kế của nhà sản xuất đối với từng loại xe cơ giới.",1,2,3,4,1));
        dbHelper.insertCauHoi(new cauhoi("Câu 24","Hành vi bỏ trốn sau khi gây tai nạn để trốn tránh trách nhiệm hoặc khi có điều kiện mà cố ý không cứu giúp người bị tai nạn giao thông có bị nghiêm cấm hay không?","Không bị nghiêm cấm","Nghiêm cấm tùy từng trường hợp cụ thể.","Bị nghiêm cấm.","","Bị nghiêm cấm.",1,2,3,4,3));
        dbHelper.insertCauHoi(new cauhoi("Câu 25","Khi xảy ra tai nạn giao thông, những hành vi nào ghi ở dưới đây bị nghiêm cấm?","Xâm phạm tính mạng, sức khỏe, tài sản của người bị tai nạn giao thông, xâm phạm tính mạng, sức khỏe, tài sản của người gây tai nạn giao thông.","Lợi dụng việc xảy ra tai nạn giao thông để hành hung, đe dọa, xúi giục, gây sức ép, làm mất trật tự, cản trở việc xử lý tai nạn giao thông.","","","Xâm phạm tính mạng, sức khỏe, tài sản của người bị tai nạn giao thông, xâm phạm tính mạng, sức khỏe, tài sản của người gây tai nạn giao thông.",1,2,3,4,1));
        dbHelper.insertCauHoi(new cauhoi("Câu 26","Việc sản xuất, mua bán, sử dụng biển xe cơ giới, xe máy chuyên dùng được quy định như thế nào trong Luật giao thông đường bộ ?","Nghiêm cấm sản xuất, được phép sử dụng","Nghiêm cấm mua bán,cho phép sử dụng.","Nghiêm cấm sản xuất, mua bán, sử dụng trái phép.","","Nghiêm cấm sản xuất, mua bán, sử dụng trái phép.",1,2,3,4,3));
        dbHelper.insertCauHoi(new cauhoi("Câu 27","Người lái xe không được vượt xe khác khi gặp trường hợp nào ghi ở dưới đây?","Trên cầu hẹp có một làn xe, nơi đường giao nhau, đường bộ giao nhau cùng mức với đường sắt.","Điều kiện thời tiết hoặc đường không đảm bảo an toàn cho việc vượt, xe ưu tiên đang phát tín hiệu ưu tiên làm nhiệm vụ.","","","Trên cầu hẹp có một làn xe, nơi đường giao nhau, đường bộ giao nhau cùng mức với đường sắt.",1,2,3,4,1));
        dbHelper.insertCauHoi(new cauhoi("Câu 28"," Người điều khiển xe mô tô hai bánh, ba bánh, xe gắn máy có được phép sử dụng xe để kéo, đẩy các xe khác, vật khác khi tham gia giao thông không?","Được phép.","Tùy trường hợp.","Không được phép.","","Không được phép.",1,2,3,4,3));
        dbHelper.insertCauHoi(new cauhoi("Câu 29"," Người ngồi trên xe mô tô hai bánh, ba bánh, xe gắn máy khi tham gia giao thông không được thực hiện những hành vi nào sau đây?","Đội mũ bảo hiểm và cài quai đúng cách.","Sử dụng ô; bấm, kéo hoặc đẩy các phương tiện khác.","Đứng trên yên, giá đèo hàng hoặc ngồi trên tay lái, các hành vi khác gây mất trật tự an toàn giao thông.","","Sử dụng ô; bấm, kéo hoặc đẩy các phương tiện khác.",1,2,3,4,2));
        dbHelper.insertCauHoi(new cauhoi("Câu 30","Người ngồi trên xe mô tô hai bánh, xe mô tô ba bánh, xe gắn máy khi tham gia giao thông có được mang, vác vật cồng kềnh hay không?","Được mang, vác tùy trường hợp cụ thể.","Không được mang, vác.","Được mang, vác nhưng phải đảm bảo an toàn.","","Không được mang, vác.",1,2,3,4,2));

    }
    private void Themcauhoi4() {
        dbHelper.insertCauHoi(new cauhoi("Câu 31","Khi điều khiển xe mô tô hai bánh, mô tô ba bánh, xe gắn máy những hành vi nào không được phép?","Buông cả hai tay hoặc đi xe bằng một bánh đối với xe hai bánh, bằng hai bánh đối với xe ba bánh, chạy quá tốc độ quy định.","Sử dụng xe để kéo, đẩy xe khác, vật khác và chở vật cồng kềnh, để chân chống quẹt xuống đất và cá hành vi khác gây mất trật tự an toàn giao thông.","Chạy đúng tốc độ quy định và chấp hành đúng quy tắc giao thông đường bộ.","","Buông cả hai tay hoặc đi xe bằng một bánh đối với xe hai bánh, bằng hai bánh đối với xe ba bánh, chạy quá tốc độ quy định.",1,2,3,4,1));
        dbHelper.insertCauHoi(new cauhoi("Câu 32","Bảo đảm trật tự an toàn giao thông đường bộ là trách nhiệm của ai?","Là trách nhiệm của ngành giao thông vận tải và ngành công an.","Là trách nhiệm của cơ quan, tổ chức, cá nhân","Là trách nhiệm của cảnh sát giao thông.","","Là trách nhiệm của cơ quan, tổ chức, cá nhân.",1,2,3,4,2));
        dbHelper.insertCauHoi(new cauhoi("Câu 33"," Tại nơi đường giao nhau, khi đèn điều khiển giao thông có tín hiệu vàng, người điều khiển phương tiện như thế nào?","Phải cho xe dừng lại trước vạch dừng,trừ trường hợp đã đi quá vạch dừng thì được đi tiếp; trong trường hợp tín hiệu vàng nhấp nháy là được đi nhưng phải giảm tốc độ, chú ý quan sát, nhường đường cho người đi bộ qua đường.","Phải cho xe nhanh chóng vượt qua vạch dừng để đi qua đường giao nhau và chú ý đảm bảo an toàn; khi đèn tín hiệu vàng nhấp nháy là được đi nhưng phải giảm tốc độ, chú ý quan sát người đi bộ để đảm bảo an toàn.","Cả 2 ý nêu trên.","","Phải cho xe dừng lại trước vạch dừng,trừ trường hợp đã đi quá vạch dừng thì được đi tiếp; trong trường hợp tín hiệu vàng nhấp nháy là được đi nhưng phải giảm tốc độ, chú ý quan sát, nhường đường cho người đi bộ qua đường.",1,2,3,4,1));
        dbHelper.insertCauHoi(new cauhoi("Câu 34","Biển báo hiệu đường bộ gồm những nhóm nào, ý nghĩa của từng nhóm?","Nhóm biển báo cấm để biểu thị các điều cấm; nhóm biển báo hiệu nguy hiểm để cảnh báo các tình huống nguy hiểm có thể xảy ra, nhóm biển hiệu lệnh để báo hiệu các hiệu lệnh phải thi hành.","Nhóm biển chỉ dẫn để chỉ dẫn hướng đi hoặc các điều biết; nhóm biển phụ để thuyết minh bổ sung các loại biển báo cấm, biển báo nguy hiểm, biển hiệu lệnh và biển chỉ dẫn.","","","Phải cho xe dừng lại trước vạch dừng,trừ trường hợp đã đi quá vạch dừng thì được đi tiếp; trong trường hợp tín hiệu vàng nhấp nháy là được đi nhưng phải giảm tốc độ, chú ý quan sát, nhường đường cho người đi bộ qua đường.",1,2,3,4,1));
        dbHelper.insertCauHoi(new cauhoi("Câu 35","Tại nơi đường giao nhau, khi người điều khiển giao thông ra hiệu lệnh bằng hai tay hoặc một tay giang ngang để báo hiệu thì người tham gia giao thông phải đi như thế nào là đúng quy tắc giao thông?","Người tham gia giao thông ở phía trước và ở phía sau người điều khiển giao thông phải dừng lại; người tham gia giao thông ở phía bên phải và bên trái người điều khiển được đi.","Người tham gia giao thông ở phía trước và ở phía sau người điều khiển giao thông được đi thẳng; người tham gia giao thông ở phía bên phải và bên trái người điều khiển giao thông được đi thẳng và rẽ phải.","","","Nhóm biển báo cấm để biểu thị các điều cấm; nhóm biển báo hiệu nguy hiểm để cảnh báo các tình huống nguy hiểm có thể xảy ra, nhóm biển hiệu lệnh để báo hiệu các hiệu lệnh phải thi hành.",1,2,3,4,1));
        dbHelper.insertCauHoi(new cauhoi("Câu 36"," Tại nơi đường giao nhau, khi người điều khiển giao thông ra hiệu lệnh tay giơ thẳng đứng để báo hiệu thì người tham gia giao thông phải đi như thế nào?","Người tham gia giao thông ở phía trước và ở phía sau người điều khiển giao thông phải dừng lại, người tham gia giao thông ở phía bên phải và bên trái người điều khiển được đi.","Người tham gia giao thông ở các hướng phải dừng lại.","Tất cả các trường hợp trên.","","Người tham gia giao thông ở phía trước và ở phía sau người điều khiển giao thông phải dừng lại; người tham gia giao thông ở phía bên phải và bên trái người điều khiển được đi.",1,2,3,4,1));
        dbHelper.insertCauHoi(new cauhoi("Câu 37","Tại nơi đường giao nhau, khi người điều khiển giao thông ra hiệu lệnh bằng tay phải giơ về phía trước để báo hiệu thì người tham gia giao thông phải đi như thế nào?","Người tham gia giao thông ở phía sau người điều khiển phải dừng lại; người ở phía trước người điều khiển được rẽ trái; người ở bên trái người điều khiển được rẽ trái; người đi bộ qua đường phải dừng lại sau lưng người điều khiển giao thông.Người tham giao giao thông ở phía sau và bên phải người điều khiển phải dừng lại; người ở phía trước người điều khiển được rẽ phải; người ở phía bên trái người điều khiển giao thông được đi tất cả các hướng; người đi bộ qua đường phải đi sau lưng người điều khiển giao thông.","Người tham giao giao thông ở phía sau và bên phải người điều khiển phải dừng lại; người ở phía trước người điều khiển được rẽ phải; người ở phía bên trái người điều khiển giao thông được đi tất cả các hướng; người đi bộ qua đường phải đi sau lưng người điều khiển giao thông.","","","Người tham giao giao thông ở phía sau và bên phải người điều khiển phải dừng lại; người ở phía trước người điều khiển được rẽ phải; người ở phía bên trái người điều khiển giao thông được đi tất cả các hướng; người đi bộ qua đường phải đi sau lưng người điều khiển giao thông.",1,2,3,4,2));
        dbHelper.insertCauHoi(new cauhoi("Câu 38","Trên đường giao thông, khi hiệu lệnh của người điều khiển giao thông trái với hiệu lệnh của đèn hoặc biển báo hiệu thì người tham gia giao thông phải chấp hành theo hiệu lệnh nào?","Hiệu lệnh của người điều khiển giao thông","Hiệu lệnh của đèn điều khiển giao thông.","Hiệu lệnh của biển báo hiệu đường bộ.","","Hiệu lệnh của người điều khiển giao thông.",1,2,3,4,1));
        dbHelper.insertCauHoi(new cauhoi("Câu 39","Tại nơi có biển báo hiệu cố định lại có báo hiệu tạm thời thì người tham gia giao thông phải chấp hành hiệu lệnh của báo hiệu nào?","Biển báo hiệu cố định.","Báo hiệu tạm thời.","","","Báo hiệu tạm thời.",1,2,3,4,2));
        dbHelper.insertCauHoi(new cauhoi("Câu 40","Trên đường có nhiều làn đường cho xe đi cùng chiều được phân biệt bằng vạch kẻ phân làn đường, người điều khiển phương tiện phải cho xe đi như thế nào?","Cho xe đi trên bất kì làn đường nào,khi cần thiết phải chuyển làn đường, người lái xe phải có đèn tín hiệu báo trước và phải bảo đảm an toàn.","Phải cho xe đi trong một làn đường và chỉ được chuyển làn đường ở những nơi cho phép; khi chuyển làn phải có tín hiệu báo trước và phải đảm bảo an toàn.","Phải cho xe đi trong một làn, khi chuyển làn đường phải có tín hiệu báo trước, chú ý quan sát để bảo đảm an toàn.","","Phải cho xe đi trong một làn đường và chỉ được chuyển làn đường ở những nơi cho phép; khi chuyển làn phải có tín hiệu báo trước và phải đảm bảo an toàn.",1,2,3,4,1));

    }
    private void Themcauhoi() {
        dbHelper.insertCauHoi(new cauhoi("Câu 1","Khái niệm “đường bộ” được hiểu như thế nào là đúng? “Đường bộ” gồm:","Đường bộ, cầu đường bộ.","Hầm đường bộ, bến phà đường bộ.","Đường, cầu đường bộ, hầm đường bộ, bến phà đường bộ và các công trình phụ trợ khác.","","Đường bộ, cầu đường bộ.",1,2,3,4,1));
        dbHelper.insertCauHoi(new cauhoi("Câu 2","“Vạch kẻ đường” được hiểu như thế nào là đúng?","Vạch kẻ đường là vạch chỉ sự phân chia làn đường, vị trí hoặc hướng đi, vị trí dừng lại.","Vạch kẻ đường là vạch chỉ sự phân biệt trí dừng, đỗ trên đường.","Tất cả các ý nêu trên.","","Vạch kẻ đường là vạch chỉ sự phân chia làn đường, vị trí hoặc hướng đi, vị trí dừng lại.",1,2,3,4,1));
        dbHelper.insertCauHoi(new cauhoi("Câu 3","Khái niệm “phần đường xe chạy” được hiểu như thế nào là đúng?","Là phần của đường bộ được sử dụng cho các phương tiện giao thông qua lại.","Là phần đường bộ được sử dụng cho các phương tiện giao thông qua lại, dải đất dọc hai bên đường để đảm bảo an toàn giao thông.","Là phần đường bộ được sử dụng cho các phương tiện giao thông qua lại, các công trình, thiết bị phụ trợ khác và dải đất dọc hai bên đường để đảm bảo an toàn giao thông.","","Là phần của đường bộ được sử dụng cho các phương tiện giao thông qua lại.",1,2,3,4,1));
        dbHelper.insertCauHoi(new cauhoi("Câu 4","Khái niệm “làn đường” được hiểu như thế nào là đúng?","Là một phần của đường được chia theo chiều ngang của đường, có bề rộng đủ cho xe đỗ an toàn.","Là một phần đường xe chạy được chia theo chiều dọc của đường, có bề rộng đủ cho xe chạy an toàn.","Cả 02 ý trên.","","Là một phần đường xe chạy được chia theo chiều dọc của đường, có bề rộng đủ cho xe chạy an toàn.",1,2,3,4,2));
        dbHelper.insertCauHoi(new cauhoi("Câu 5","Khái niệm “đường phố” được hiểu như thế nào là đúng?","Đường phố là đường đô thị, gồm lòng đường và hè phố.","Đường phố là đường bộ ngoài đô thị có lòng đường đủ rộng cho các phương tiện giao thông qua lại","Cả 02 ý nêu trên.","","Đường phố là đường đô thị, gồm lòng đường và hè phố.",1,2,3,4,1));
        dbHelper.insertCauHoi(new cauhoi("Câu 6","Khái niệm “dải phân cách” được hiểu như thế nào là đúng?"," Là bộ phận của đường để phân chia mặt đường thành hai chiều xe chạy riêng biệt hoặc để phân chia phần đường của xe cơ giới và xe thô sơ.","Là bộ phận của đường để xác định ranh giới của đất dành cho người đi bộ theo chiều ngang của đường.","Là bộ phận của đường để ngăn cách không cho các loại xe vào những nơi không được phép.","","Là bộ phận của đường để phân chia mặt đường thành hai chiều xe chạy riêng biệt hoặc để phân chia phần đường của xe cơ giới và xe thô sơ.",1,2,3,4,1));
        dbHelper.insertCauHoi(new cauhoi("Câu 7","Dải phân cách trên đường bộ có những loại nào?","Loại cố định.","Loại di động.","","","Loại cố định.",1,2,3,4,1));
        dbHelper.insertCauHoi(new cauhoi("Câu 8"," Khái niệm “đường ưu tiên” được hiểu như thế nào là đúng?","Đường ưu tiên là đường mà trên đó phương tiện tham gia giao thông đường bộ phải nhường đường cho các phương tiện đến từ hướng khác khi qua nơi đường giao nhau, có thể được cắm biển báo hiệu đường ưu tiên.","Đường ưu tiên là đường mà trên đó phương tiện tham gia giao thông đường bộ được các phương tiện đến từ hướng khác nhường đường khi qua nơi đường giao nhau, được cắm biển báo hiệu đường ưu tiên.","Đường ưu tiên là đường chỉ dành cho một số loại phương tiện tham gia giao thông, được cắm biển báo hiệu đường ưu tiên.","","Đường ưu tiên là đường mà trên đó phương tiện tham gia giao thông đường bộ được các phương tiện đến từ hướng khác nhường đường khi qua nơi đường giao nhau, được cắm biển báo hiệu đường ưu tiên.",1,2,3,4,2));
        dbHelper.insertCauHoi(new cauhoi("Câu 9","“Phương tiện giao thông đường bộ” gồm những loại nào?","Phương tiện giao thông cơ giới đường bộ, phương tiện giao thông thô sơ đường bộ.","Phương tiện giao thông thô sơ đường bộ, phương tiện giao thông cơ giới đường bộ và xe máy chuyên dùng.","Cả hai ý nêu trên.","","Phương tiện giao thông cơ giới đường bộ, phương tiện giao thông thô sơ đường bộ.",1,2,3,4,1));
        dbHelper.insertCauHoi(new cauhoi("Câu 10","Khái niệm “phương tiện giao thông cơ giới đường bộ” được hiểu như thế nào là đúng?","Gồm xe ô tô, máy kéo, xe mô tô hai bánh, xe mô tô ba bánh, xe gắn máy, xe cơ giới dành cho người khuyết tật và xe máy chuyên dùng.","Gồm xe ô tô, máy kéo, rơ moóc hoặc sơ mi rơ moóc được kéo bởi xe ô tô, máy kéo, xe mô tô hai bánh, xe mô tô ba bánh, xe gắn máy (kể cả xe máy điện) và các loại xe tương tự.","","","Gồm xe ô tô, máy kéo, rơ moóc hoặc sơ mi rơ moóc được kéo bởi xe ô tô, máy kéo, xe mô tô hai bánh, xe mô tô ba bánh, xe gắn máy (kể cả xe máy điện) và các loại xe tương tự.",1,2,3,4,2));



    }
}
