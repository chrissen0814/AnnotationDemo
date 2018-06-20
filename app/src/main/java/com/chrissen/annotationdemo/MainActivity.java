package com.chrissen.annotationdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.chrissen.apt_annotation.BindView;
import com.chrissen.apt_api.Butter;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.text_view)
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Butter.bind(this);
        mTextView.setText("Hello World and Thank You");
    }
}
