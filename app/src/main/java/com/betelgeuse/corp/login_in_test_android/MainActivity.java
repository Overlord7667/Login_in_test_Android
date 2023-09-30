package com.betelgeuse.corp.login_in_test_android;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textView = findViewById(R.id.textLog);
        TextView textView2 = findViewById(R.id.textPas);


        Paint paint = textView.getPaint();
        paint.setFlags(Paint.UNDERLINE_TEXT_FLAG);

        Paint paint1 = textView2.getPaint();
        paint1.setFlags(Paint.UNDERLINE_TEXT_FLAG);
    }
}