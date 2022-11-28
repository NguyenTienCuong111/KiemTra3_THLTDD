package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PhepNhan extends AppCompatActivity {
    EditText so_a, so_b;
    TextView ketqua;
    Button nhan;
    float a, b, y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phep_nhan);
        so_a = (EditText) findViewById(R.id.edt_input1);
        so_b = (EditText) findViewById(R.id.edt_input2);
        ketqua = (TextView) findViewById(R.id.tv_result);
        nhan = (Button) findViewById(R.id.btn_nhan);
        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(so_a.getText().toString().equals("")){
                    Toast.makeText(PhepNhan.this, "Hãy nhập số a", Toast.LENGTH_SHORT).show();
                }
                else if(so_b.getText().toString().equals("")){
                    Toast.makeText(PhepNhan.this, "Hãy nhập số b", Toast.LENGTH_SHORT).show();
                }
                a= Float.parseFloat(so_a.getText().toString());
                b= Float.parseFloat(so_b.getText().toString());
                y= a*b;
                ketqua.setText(String.valueOf(y));
            }
        });
    }
}