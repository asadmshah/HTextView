package com.example.demoapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

import com.hanks.htextview.base.HTextView;
import com.hanks.htextview.evaporate.EvaporateTextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EvaporateTextViewActivity extends BaseActivity {

    private DateFormat dateFormat = SimpleDateFormat.getDateTimeInstance();

    private EvaporateTextView textView;
    private Button buttonSetText;
    private Button buttonAnimateText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaporate_text_view);

        textView = findViewById(R.id.textview);

        buttonSetText = findViewById(R.id.set);
        buttonSetText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setCharacterTime(32);
                textView.animateText(dateFormat.format(new Date()));
            }
        });

        buttonAnimateText = findViewById(R.id.animate);
        buttonAnimateText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setCharacterTime(300);
                textView.animateText(dateFormat.format(new Date()));
            }
        });
    }
}
