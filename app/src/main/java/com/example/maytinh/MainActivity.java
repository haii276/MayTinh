package com.example.maytinh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    EditText txtX , txtY;
    TextView txtResult;
    Button btnPlus,btnSub,btnMulti, btnDivision, btnRemainder;


    private void innitControl(){
        txtX  = findViewById(R.id.txtX);
        txtY  = findViewById(R.id.txtY);
        txtResult  = findViewById(R.id.txtResult);
        btnPlus  = findViewById(R.id.btnPlus);
        btnSub = findViewById(R.id.btnSub);
        btnMulti = findViewById(R.id.btnMulti);
        btnDivision = findViewById(R.id.btnDivision);
        btnRemainder = findViewById(R.id.btnRemainder);
        btnPlus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(txtX.getText().toString());
                int y = Integer.parseInt(txtY.getText().toString());
                int result = x +y;
                txtResult.setText(String.valueOf(result));
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(txtX.getText().toString());
                int y = Integer.parseInt(txtY.getText().toString());
                int result = x - y;
                txtResult.setText(String.valueOf(result));
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(txtX.getText().toString());
                int y = Integer.parseInt(txtY.getText().toString());
                int result = x * y;
                txtResult.setText(String.valueOf(result));
            }
        });
        btnDivision.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(txtX.getText().toString());
                int y = Integer.parseInt(txtY.getText().toString());
                int result = x / y;
                txtResult.setText(String.valueOf(result));
            }
        });
        btnRemainder.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(txtX.getText().toString());
                int y = Integer.parseInt(txtY.getText().toString());
                int result = x % y;
                txtResult.setText(String.valueOf(result));
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        innitControl();
    }
}