package com.example.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class QuenMatKhau1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_quen_mat_khau1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView textDangNhap = findViewById(R.id.textDangNhapNgay);
        textDangNhap.setOnClickListener(
                v -> {
                    Intent intent = new Intent(this, GiaoDienDangNhap2.class);
                    startActivity(intent);
                }
        );
        Button buttonTiepTuc = findViewById(R.id.btTiepTuc);
        buttonTiepTuc.setOnClickListener(
                v -> {
                    Intent intent = new Intent(this, QuenMatKhau2.class);
                    startActivity(intent);
                }
        );
        TextView textQuayLai = findViewById(R.id.textQuayVeDangNhap);
        textQuayLai.setOnClickListener(
                v -> {
                    Intent intent = new Intent(this, GiaoDienDangNhap2.class);
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