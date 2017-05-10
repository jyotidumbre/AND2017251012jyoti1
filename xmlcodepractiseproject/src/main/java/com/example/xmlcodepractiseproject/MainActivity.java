package com.example.xmlcodepractiseproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      final   EditText editext=(EditText)findViewById(R.id.editext);
      final   EditText editext1=(EditText)findViewById(R.id.editext1);
      final   EditText editext2=(EditText)findViewById(R.id.editext2);

        Button but1=(Button)findViewById(R.id.but1);
        Button but2=(Button)findViewById(R.id.but2);
        Button but3=(Button)findViewById(R.id.but3);
        Button but4=(Button)findViewById(R.id.but4);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=editext.getText().toString();
                Integer a=Integer.parseInt(str);
                String str1=editext1.getText().toString();
                Integer b=Integer.parseInt(str1);
                Integer result=a+b;
                editext2.setText(result.toString());
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=editext.getText().toString();
                Integer a=Integer.parseInt(str);
                String str1=editext1.getText().toString();
                Integer b=Integer.parseInt(str1);
                Integer result=a-b;
                editext2.setText(result.toString());

            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=editext.getText().toString();
                Integer a=Integer.parseInt(str);
                String str1=editext1.getText().toString();
                Integer b=Integer.parseInt(str1);
                Integer result= a*b;
                editext2.setText(result.toString());

            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=editext.getText().toString();
                Integer a=Integer.parseInt(str);
                String str1=editext1.getText().toString();
                Integer b=Integer.parseInt(str1);
                Integer result=a%b;
                editext2.setText(result.toString());
            }
        });
    }
}
