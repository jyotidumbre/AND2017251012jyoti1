package com.example.dataaddition;

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
        LinearLayout lyout1=new LinearLayout(this);
        lyout1.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams Linaer=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
        lyout1.setLayoutParams(Linaer);

        final EditText edit1=new EditText(this);
        edit1.setHint("enter number");
        LinearLayout.LayoutParams editlinear=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        edit1.setLayoutParams(editlinear);
        lyout1.addView(edit1);

        Button butt=new Button(this);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=edit1.getText().toString();
              //  edit1.setText(s1.toUpperCase());


            }
        });
        butt.setText("OK");
        LinearLayout.LayoutParams buttlinear=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        butt.setLayoutParams(buttlinear);
        lyout1.addView(butt);

        setContentView(lyout1);
    }
}
