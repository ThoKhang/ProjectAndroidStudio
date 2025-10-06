package com.example.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GiaoDienDangNhap2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_giao_dien_dang_nhap2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView textDangKy = findViewById(R.id.chuyenDenDangKy);
        textDangKy.setOnClickListener(
                v -> {
                    Intent intent = new Intent(this, GiaoDienDangNhap.class);
                    startActivity(intent);
                }
        );
        TextView textQuenMatKhau = findViewById(R.id.textQuenMatKhau);
        textQuenMatKhau.setOnClickListener(
                v -> {
                    Intent intent = new Intent(this, QuenMatKhau1.class);
                    startActivity(intent);
                }
        );
        // Ẩn status bar + navigation bar
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_FULLSCREEN |
                        View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
                        View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        );
    }
}