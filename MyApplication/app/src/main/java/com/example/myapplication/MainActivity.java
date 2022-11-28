package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvPhepTinh;
    ArrayList<PhepTinh> arrayPhepTinh;
    PhepTinhAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Anhxa();
        adapter = new PhepTinhAdapter(this, R.layout.thongtin_pheptinh, arrayPhepTinh);
        lvPhepTinh.setAdapter(adapter);

        lvPhepTinh.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    startActivity(new Intent(MainActivity.this, PhepCong.class));
                }
                if (i == 1) {
                    startActivity(new Intent(MainActivity.this, PhepTru.class));
                }
                if (i == 2) {
                    startActivity(new Intent(MainActivity.this, PhepNhan.class));
                }
                if (i == 3) {
                    startActivity(new Intent(MainActivity.this, PhepChia.class));
                }
                if (i == 4) {
                    startActivity(new Intent(MainActivity.this, PhepLog.class));
                }






            }
        });

    }



    private void Anhxa() {
        lvPhepTinh = (ListView) findViewById(R.id.listviewPhepTinh);
        arrayPhepTinh = new ArrayList<>();

        arrayPhepTinh.add(new PhepTinh("Phép cộng", "Cộng"));
        arrayPhepTinh.add(new PhepTinh("Phép Trừ", "Trừ"));
        arrayPhepTinh.add(new PhepTinh("Phép Nhân", "Nhân"));
        arrayPhepTinh.add(new PhepTinh("Phép Chia", "Chia"));
        arrayPhepTinh.add(new PhepTinh("Logarit", "logarit"));
    }
}