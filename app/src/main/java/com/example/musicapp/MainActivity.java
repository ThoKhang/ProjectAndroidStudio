package com.example.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_man_hinh_vao);

        // Ẩn status bar + navigation bar
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_FULLSCREEN |
                        View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
                        View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        );

        // Delay 3s rồi chuyển sang GiaoDienDangNhap
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(MainActivity.this, GiaoDienDangNhap.class);
            startActivity(intent);
            finish(); // đóng MainActivity để không quay lại
        }, 3000); // 3000ms = 3 giây
    }
}
