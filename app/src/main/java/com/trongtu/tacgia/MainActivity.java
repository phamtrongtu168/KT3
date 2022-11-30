package com.trongtu.tacgia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.zantung.pheptinh.R;
import com.trongtu.tacgia.adapter.TacGiaAdapter;
import com.trongtu.tacgia.model.TacGia;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listViewThi;
    ArrayList<TacGia> arrayThi;
    TacGiaAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        adapter = new TacGiaAdapter(this, R.layout.row_tacgia, arrayThi);
        listViewThi.setAdapter(adapter);

        listViewThi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, DetailsTacGia.class);
                intent.putExtra("data", arrayThi.get(i));
                startActivity(intent);
            }
        });
    }

    private void AnhXa(){
        listViewThi = (ListView) findViewById(R.id.lvThi);
        arrayThi = new ArrayList<>();
        arrayThi.add(new TacGia("Huy Cận", "HC",R.drawable.huycan));
        arrayThi.add(new TacGia("Mạc Ngôn", "MN",R.drawable.macngon));
        arrayThi.add(new TacGia("Shakespeare", "SS",R.drawable.shakespeare));
        arrayThi.add(new TacGia("Hemingway", "HMW",R.drawable.he));
        arrayThi.add(new TacGia("Hồ Chí Minh", "HCM",R.drawable.hcm));
        arrayThi.add(new TacGia("Trịnh Công Sơn", "TCS",R.drawable.trinhcongson));


    }
}