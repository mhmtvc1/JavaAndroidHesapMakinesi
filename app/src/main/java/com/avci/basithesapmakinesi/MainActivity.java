package com.avci.basithesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText1, editText2;
    private TextView btnresult;
    private String firstnumber, secondnumber;
    private int n1, n2, result;
    private Calculate Calculate;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        btnresult = (TextView) findViewById(R.id.btnresult);

    }

    public void btncalculate( int checkedId){

        firstnumber = editText1.getText().toString();
        secondnumber = editText2.getText().toString();

        if (!TextUtils.isEmpty(firstnumber) && !TextUtils.isEmpty(secondnumber)){

            n1 = Integer.valueOf(firstnumber);
            n2 = Integer.valueOf(secondnumber);
            Calculate = new Calculate(n1,n2);

            if (checkedId== R.id.btnplus){
                result = Calculate.plus();


            } else if (checkedId == R.id.btnminus) {
                result = Calculate.minus();
                
            } else if (checkedId == R.id.btnmultiply) {
                result = Calculate.multiply();

            } else if (checkedId == R.id.btndivide) {
                result = Calculate.divide();

            }
            btnresult.setText("result: "+result);
        }
        else btnresult.setText("blank.");




    }


}