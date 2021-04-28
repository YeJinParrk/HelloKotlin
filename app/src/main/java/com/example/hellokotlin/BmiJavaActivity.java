package com.example.hellokotlin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BmiJavaActivity extends AppCompatActivity {
    EditText heightFeild, weightFeild;
    TextView txtResult;
    Button btnBmi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_view_binding);

        heightFeild =findViewById(R.id.heightFeild);
        weightFeild =findViewById(R.id.weightFeild);
        txtResult =findViewById(R.id.txtResult);
        btnBmi =findViewById(R.id.btnBmi);

        btnBmi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String sHeght = heightFeild.getText().toString();
                String sWeight = weightFeild.getText().toString();
/*                try{
                    double bmi = Double.parseDouble(sWeight) / Math.pow(Double.parseDouble(sHeght)/100.0,2.0);
                    txtResult.setText("Your BMI = " +bmi);
                }catch (Exception e){
                    txtResult.setText("Input(s) missing");
                }*/
                if(!sHeght.isEmpty() || !sWeight.isEmpty()){
                    double bmi = Double.parseDouble(sWeight) / Math.pow(Double.parseDouble(sHeght)/100.0,2.0);
                    txtResult.setText("Your BMI = " +bmi);
                }else {
                    txtResult.setText("Input(s) missing");
                }
            }
        });
    }

}