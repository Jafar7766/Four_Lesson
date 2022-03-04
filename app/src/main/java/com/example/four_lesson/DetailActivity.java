package com.example.four_lesson;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.four_lesson.model.User;

public class DetailActivity extends AppCompatActivity {
    static  final String TAG = DetailActivity.class.toString();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_main);
        initViews();
    }
    void initViews(){
        TextView tv_detail = findViewById(R.id.tv_detail);

        User user = (User) getIntent().getSerializableExtra("user");
        Log.d(TAG, user.toString());

        tv_detail.setText(user.toString());
    }
}
