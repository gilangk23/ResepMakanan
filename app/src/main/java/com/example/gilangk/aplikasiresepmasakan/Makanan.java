package com.example.gilangk.aplikasiresepmasakan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Makanan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan);

        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        TextView textView = (TextView) findViewById(R.id.textView);

        Intent intent = getIntent();
        imageView.setImageResource(intent.getIntExtra("gambar",0));
        textView.setText(intent.getStringExtra("isi"));
    }
}
