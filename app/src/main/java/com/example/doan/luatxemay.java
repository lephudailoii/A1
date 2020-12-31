package com.example.doan;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import java.util.ArrayList;
public class luatxemay extends ListFragment {
    ListView list;
    ArrayList<itemluat> arrayList=new ArrayList<itemluat>();
    luatadapter luatadapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.luatxemay, container, false);
        Getdata();
        luatadapter = new luatadapter(getActivity(),R.layout.itemluat,arrayList);
        setListAdapter(luatadapter);
        return view;

    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
       int vitri = position;
        AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity());
       switch (vitri){
            case 0:
                dialog.setTitle("Luật Xe máy");
                dialog.setMessage("- Không được rẽ trái khi đèn đỏ\n"+
                        "- Không được rẽ trái/phải khi có biển báo cấm");
                dialog.setPositiveButton("Trở về ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.show();
                break;
           case 1:
               dialog.setTitle("Luật Xe máy");
               dialog.setMessage("- Không được đậu xe ở nơi có biển báo cấm hoặc cách biển báo cấm 20m");
               dialog.setPositiveButton("Trở về ", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {

                   }
               });
               dialog.show();
               break;
           case 2:
               dialog.setTitle("Luật Xe máy");
               dialog.setMessage("- Phải có giấy phép lái xe mới được tham gia giao thông");
               dialog.setPositiveButton("Trở về ", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {

                   }
               });
               dialog.show();
               break;
           case 3:
               dialog.setTitle("Luật Xe máy");
               dialog.setMessage("- Khi tham gia giao thông phải có carvet xe để xác nhận xe chính chủ và không phải xe gian");
               dialog.setPositiveButton("Trở về ", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {

                   }
               });
               dialog.show();
               break;
           case 4:
               dialog.setTitle("Luật Xe máy");
               dialog.setMessage("- Khi tham gia giao thông được chạy quá tốc độ cho phép tùy khu vực: \n" +
                       "- Dưới 40km ở khu vực đông dân cư \n"+
                       "- Dưới 60km ở khu vực bình thường");

               dialog.setPositiveButton("Trở về ", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {

                   }
               });
               dialog.show();
               break;
           case 5:
               dialog.setTitle("Luật Xe máy");
               dialog.setMessage("- Đã uống rựu bia là không lái xe ");
               dialog.setPositiveButton("Trở về ", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {

                   }
               });
               dialog.show();
               break;
           case 6:
               dialog.setTitle("Luật Xe máy");
               dialog.setMessage("- Không được phép chạy tiếp khi đèn đỏ");
               dialog.setPositiveButton("Trở về ", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {

                   }
               });
               dialog.show();
               break;
               default:
        }
        super.onListItemClick(l, v, position, id);

    }

    private void Getdata() {
        arrayList.add(new itemluat("Rẽ phải/trái không đúng nơi","300,000VND - 500,000 VND"));
        arrayList.add(new itemluat("Đậu xe sai nơi quy định","500,000 VND"));
        arrayList.add(new itemluat("Không có bằng lái xe","1,000,000 VND"));
        arrayList.add(new itemluat("Không có cavet xe","1,000,000 VND"));
        arrayList.add(new itemluat("Chạy xe quá tốc độ quy định","500,000 VND- 1,000,000 VND"));
        arrayList.add(new itemluat("Nồng độ cồn cao","500,000 VND- 1,000,000 VND"));
        arrayList.add(new itemluat("Vượt đèn đỏ","500,000 VND- 1,000,000 VND"));
    }
}