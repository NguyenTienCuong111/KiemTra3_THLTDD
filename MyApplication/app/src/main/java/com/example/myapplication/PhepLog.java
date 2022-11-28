package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PhepLog extends AppCompatActivity {
    EditText so_a;
    TextView ketqua;
    Button logarit;
    Float a;
    Double y;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phep_log);
        so_a = (EditText) findViewById(R.id.edt_input1);

        ketqua = (TextView) findViewById(R.id.tv_result);
        logarit = (Button) findViewById(R.id.btn_log);
        logarit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(so_a.getText().toString().equals("")){
                    Toast.makeText(PhepLog.this, "Hãy nhập số a", Toast.LENGTH_SHORT).show();
                }

                a= Float.parseFloat(so_a.getText().toString());

                y= Math.log(a);
                ketqua.setText(String.valueOf(y));
            }
        });
    }
}