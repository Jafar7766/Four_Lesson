package com.example.four_lesson;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
    void initViews(){
        Button b_detail = findViewById(R.id.b_detail);
        b_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDetailActivity();
            }
        });
    }
    void openDetailActivity(){
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("name", "Jafar Bakhromov");
        startActivity(intent);
    }
}