package com.example.caculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;


/**
 * MainActivity
 */

public class MainActivity extends AppCompatActivity {

    private EditText display;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.editText);
        display.setText("");

    }

    /**
     * Update a string to the Edittext
     * @param strToAdd string to be updated
     */
    private void updateText(String strToAdd) {
        String oldStr = display.getText().toString();
        int cursorPos = display.getSelectionStart();
        String leftString = oldStr.substring(0, cursorPos);
        String rightString = oldStr.substring(cursorPos);
        display.setText(String.format("%s%s%s", leftString, strToAdd, rightString));
        display.setSelection(cursorPos + 1);
    }


    /**
     * Value that indicate which operation to do
     */
    static int value = 0;

    /**
     * Indicate if a decimal placed or not
     * -1: decimal placed
     */
    static int value2 = 0;

    /**
     * Saved value for later calculation
     */
    static float savedValue = 0;

    /**
     * Return the value Edittext received to compute calculations
     * @return float User input value
     */
    private float update() {
        value2 = 0;
        if (!display.getText().toString().equals("")) {
            return Float.parseFloat(display.getText().toString());
        }
        return 0;
    }


    /**
     * Add 0 to the edittext
     * @param view view that was clicked
     */
    public void btn0(View view) {
        updateText("0");
    }

    /**
     * Add 1 to the edittext
     * @param view view that was clicked
     */
    public void btn1(View view) {
        updateText("1");

    }

    /**
     * Add 2 to the edittext
     * @param view view that was clicked
     */
    public void btn2(View view) {
        updateText("2");

    }

    /**
     * Add 3 to the edittext
     * @param view view that was clicked
     */
    public void btn3(View view) {
        updateText("3");

    }

    /**
     * Add 4 to the edittext
     * @param view view that was clicked
     */
    public void btn4(View view) {
        updateText("4");

    }

    /**
     * Add 5 to the edittext
     * @param view view that was clicked
     */
    public void btn5(View view) {
        updateText("5");

    }

    /**
     * Add 6 to the edittext
     * @param view view that was clicked
     */
    public void btn6(View view) {
        updateText("6");

    }

    /**
     * Add 7 to the edittext
     * @param view view that was clicked
     */
    public void btn7(View view) {
        updateText("7");

    }

    /**
     * Add 8 to the edittext
     * @param view view that was clicked
     */
    public void btn8(View view) {
        updateText("8");

    }

    /**
     * Add 9 to the edittext
     * @param view view that was clicked
     */
    public void btn9(View view) {
        updateText("9");

    }

    /**
     * Clear Edittext
     * @param view view that was clicked
     */
    public void btnClr(View view) {
        display.setText("");
        value2 =0;

    }

    /**
     * Set state to multiplication
     * @param view view that was clicked
     */
    public void btnMul(View view) {
        savedValue = update();
        display.setText("");
        value = 1;
    }

    /**
     * Set state to subtraction
     * @param view view that was clicked
     */
    public void btnSub(View view) {
        savedValue = update();
        display.setText("");
        value = 2;
    }

    /**
     * Set state to addition
     * @param view view that was clicked
     */
    public void btnAdd(View view) {
        savedValue = update();
        display.setText("");
        value = 3;
    }

    /**
     * Set state to division
     * @param view view that was clicked
     */
    public void btnDiv(View view) {
        savedValue = update();
        display.setText("");
        value = 4;

    }

    /**
     * Add decimal
     * @param view view that was clicked
     */
    public void btnDec(View view) {
        if (value2>=0) {
            if(display.getText().toString().equals("")){
                updateText("0");
            }
            updateText(".");
            value2=-1;
        }

    }

    /**
     * Shows the final result
     * @param view view that was clicked
     */
    public void btnEql(View view) {
        if (!display.getText().toString().equals("")) {
            float result = finalResult(savedValue, Float.parseFloat(display.getText().toString()));
            display.setText(Float.toString(result));
            
        }

    }

    /**
     * Compute the result and display it
     * @param num1 first number
     * @param num2 second number
     * @return String result of computation
     */
    @SuppressLint("SetTextI18n")
    public float finalResult(float num1, float num2) {
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
        
        return result;
    }




}
