package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Num1, Num2;
    TextView Result, ZnakView;
    Button btnSum, btnMinus, btnIncrease, btnDivide, btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// находим все необходимые объекты
        Num1 = (EditText) findViewById(R.id.Num1);
        Num2 = (EditText) findViewById(R.id.Num2);
        Result = (TextView) findViewById(R.id.Result);
        ZnakView = (TextView) findViewById(R.id.ZnakView);

    }

    public void Clicker (View v){
        float res = 0;
          float  x = Float.parseFloat(Num1.getText().toString()); // парсим string в float
           float y = Float.parseFloat(Num2.getText().toString());

        switch (v.getId()){
            case R.id.btnSum:
                res = x + y;
                Result.setText(Float.toString(res));
                ZnakView.setText("+");
                break;
            case R.id.btnMinus:
                res = x - y;
                Result.setText(Float.toString(res));
                ZnakView.setText("-");
                break;
            case R.id.btnIncrease:
                res = x * y;
                Result.setText(Float.toString(res));
                ZnakView.setText("X");
                break;
            case R.id.btnDivide:
                res = x / y;
                if(x == 0 || y == 0){
                    Result.setText("Error!");
                }
                else
                Result.setText(Float.toString(res));
                ZnakView.setText("/");
                break;
        }
    }

    public void Clean (View v){
        Num1.setText("");
        Num2.setText("");
        Result.setText("");
        ZnakView.setText("");
    }
}
