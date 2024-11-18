package com.example.teamproject;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView author;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        author = (TextView) findViewById(R.id.author);

        // 작가가 공란이면 작가 textView를 메인에 표시하지 않음
        if (!TextUtils.isEmpty(author.getText())) {
            author.setVisibility(View.VISIBLE);
        } else {
            author.setVisibility(View.GONE);
        }
    }
}