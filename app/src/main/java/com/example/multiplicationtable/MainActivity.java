package com.example.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText numInput ;
    Button submit;
    TextView resultview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set
        numInput= findViewById(R.id.number_id);
        submit= findViewById(R.id.btn_submit);
        resultview=findViewById(R.id.result_id);

        //set listeners
       submit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               resultview.setText("");
               for(int i =0 ; i<11 ; i++)
               {
                   resultview.setText(resultview.getText().toString()+ numInput.getText()+" x "+i+" = "+ (Integer.parseInt(String.valueOf(numInput.getText()))*i)+"\n");
               }

           }
       });

    }


}