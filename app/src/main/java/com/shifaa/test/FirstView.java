package com.shifaa.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FirstView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_view);
     }
    public void move (View view){
        final EditText txt;
        txt = (EditText)findViewById(R.id.editText);
        String    name;
        name=txt.getText().toString();
        setContentView(R.layout.activity_second_view);
        TextView txtV;
        txtV =(TextView)findViewById(R.id.textView2);
        txtV.setText(" Welcome "+name);

    }
   public void back (View view) {
        setContentView(R.layout.activity_first_view);

    }
    }
