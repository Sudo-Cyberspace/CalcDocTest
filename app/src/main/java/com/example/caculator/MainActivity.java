package com.example.caculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnAdd,btnSub,btnDiv,btnMul,btnClr,btnEql,BtnDec;


    //double val1, val2;
    private EditText display;


    //Operator optr =Operator.none;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.editText);
        display.setText("");


    }

    private void updateText(String strToAdd) {
        String oldStr = display.getText().toString();
        int cursorPos = display.getSelectionStart();
        String leftString = oldStr.substring(0, cursorPos);
        String rightString = oldStr.substring(cursorPos);
        display.setText(String.format("%s%s%s", leftString, strToAdd, rightString));
        display.setSelection(cursorPos + 1);
    }




    static int value = 0;
    static float other = 0;
    static int value2 = 0;
    private float update() {
        value2 =0;
        if (!display.getText().toString().equals("")) {
            return Float.parseFloat(display.getText().toString());

        }
        return 0;
    }



    public void btn0(View view) {
        updateText("0");

    }

    public void btn1(View view) {
        updateText("1");

    }

    public void btn2(View view) {
        updateText("2");

    }

    public void btn3(View view) {
        updateText("3");

    }

    public void btn4(View view) {
        updateText("4");

    }

    public void btn5(View view) {
        updateText("5");

    }

    public void btn6(View view) {
        updateText("6");

    }

    public void btn7(View view) {
        updateText("7");

    }

    public void btn8(View view) {
        updateText("8");

    }

    public void btn9(View view) {
        updateText("9");

    }

    public void btnClr(View view) {
        display.setText("");
        value2 =0;

    }

    public void btnMul(View view) {
        other = update();
        display.setText("");
        value = 1;
    }

    public void btnSub(View view) {
        other = update();
        display.setText("");
        value = 2;
    }

    public void btnAdd(View view) {
        other = update();
        display.setText("");
        value = 3;
    }

    public void btnDiv(View view) {
        other = update();
        display.setText("");
        value = 4;

    }

    public void btnDec(View view) {
        if (value2>=0) {
            if(display.getText().toString().equals("")){
                updateText("0");
            }
            updateText(".");
            value2=-1;
        }

    }

    public void btnEql(View view) {
        if (!display.getText().toString().equals("")) {
            finalResult(other, Float.parseFloat(display.getText().toString()));
        }

    }

    @SuppressLint("SetTextI18n")
    private void finalResult(float num1, float num2) {
        float result = 0;
        if (value == 1 ){
            result = (num1*num2);
        }
        else if(value == 2 || value == -2) {
            result =(num1 - num2);
        }

        else if (value == 3 || value == -3){
            result = num1 + num2;
        }
        else if (value == 4|| value == -4){
            result = (num1 / num2);
        }
        String result2 = Float.toString(result);

        display.setText(result2);
    }




}