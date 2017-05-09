package com.example.piyush.secondandroidcalculatorproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout lyout=new LinearLayout(this);
        lyout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams Linear =new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
         lyout.setLayoutParams(Linear);

        final EditText editText=new EditText(this);
        editText.setHint("enter number");
        LinearLayout.LayoutParams Ltext1=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        editText.setLayoutParams(Ltext1);
        lyout.addView(editText);

        final EditText editText1=new EditText(this);
        editText.setHint("enter number");
        LinearLayout.LayoutParams Ltext2=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        editText.setLayoutParams(Ltext2);
        lyout.addView(editText1);

        final EditText editText2=new EditText(this);
        editText.setHint("Result");
        LinearLayout.LayoutParams Ltext3=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        editText.setLayoutParams(Ltext3);
        lyout.addView(editText2);

        Button bt=new Button(this);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String str=editText.getText().toString();
                Integer a=Integer.parseInt(str);
             String str1=editText1.getText().toString();
                Integer b=Integer.parseInt(str1);
                Integer result=a+b;
                editText2.setText(result.toString());
            }
        });
        bt.setText("Add");
        LinearLayout.LayoutParams But=new LinearLayout.LayoutParams(500,500);
        bt.setLayoutParams(But);
        lyout.addView(bt);

        Button bt1=new Button(this);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=editText.getText().toString();
                Integer a=Integer.parseInt(str);
                String str1=editText1.getText().toString();
                Integer b=Integer.parseInt(str1);
                Integer result=a-b;
                editText2.setText(result.toString());


            }
        });
        bt.setText("Sub");
        LinearLayout.LayoutParams But1=new LinearLayout.LayoutParams(500,500);
        bt.setLayoutParams(But1);
        lyout.addView(bt1);

        Button bt2=new Button(this);
      bt2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              String str=editText.getText().toString();
              Integer a=Integer.parseInt(str);
              String str1=editText1.getText().toString();
              Integer b=Integer.parseInt(str1);
              Integer result=a*b;
              editText2.setText(result.toString());

          }
      });
        bt.setText("Mult");
        LinearLayout.LayoutParams But2=new LinearLayout.LayoutParams(500,500);
        bt.setLayoutParams(But2);
        lyout.addView(bt2);

        Button bt3=new Button(this);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=editText.getText().toString();
                Integer a=Integer.parseInt(str);
                String str1=editText1.getText().toString();
                Integer b=Integer.parseInt(str1);
                Integer result=a/b;
                editText2.setText(result.toString());

            }
        });
        bt.setText("Div");
        LinearLayout.LayoutParams But3=new LinearLayout.LayoutParams(500,500);
        bt.setLayoutParams(But3);
        lyout.addView(bt3);

    }
}
