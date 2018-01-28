package com.veliyetisgengil.benogrenmeyiseviyorum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button word,number,color,animal;
    TextView t ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animal = findViewById(R.id.btn_animal);
        color = findViewById(R.id.btn_color);
        number = findViewById(R.id.btn_number);
        word = findViewById(R.id.btn_word);
        animal.setOnClickListener(this);
        t = findViewById(R.id.isim);

    }

    @Override
    public void onClick(View view) {
    t.setText(R.string.isim);
    }
}
