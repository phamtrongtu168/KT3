package com.trongtu.tacgia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.zantung.pheptinh.R;
import com.trongtu.tacgia.model.TacGia;

import java.util.ArrayList;

public class DetailsTacGia extends AppCompatActivity {


    TextView txtIDThi, tvNho;
    String save;
    SharedPreferences sharedPreferences;
    TacGia tacGia;
    ListView listTacGia;
    ArrayList<String> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tacgia);



        Intent intent = getIntent();
        if (intent != null){
            tacGia = (TacGia) intent.getSerializableExtra("data");

        }
        AnhXa();
        arrayList = new ArrayList<>();
        arrayList.add("Trời mỗi ngày lại sáng");
        arrayList.add("Cô gái Mèo");
        arrayList.add("Những năm sáu mươi");
        arrayList.add("Phù Đổng Thiên Vương");
        arrayList.add("Hai bàn tay em");
        arrayList.add("Bài thơ cuộc đời");

        ArrayAdapter adapter = new ArrayAdapter(DetailsTacGia.this,android.R.layout.simple_list_item_1,arrayList);
        listTacGia.setAdapter(adapter);
        listTacGia.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent1 = new Intent(DetailsTacGia.this,ChiTietTacPham.class);
                startActivity(intent1);
            }
        });





    }

    private void AnhXa() {

        txtIDThi = findViewById(R.id.id_thi);
        listTacGia = findViewById(R.id.list_tacpham);

        sharedPreferences = getSharedPreferences("data", MODE_PRIVATE);
        txtIDThi.setText(tacGia.getTen_tacgia().toUpperCase());



    }
}