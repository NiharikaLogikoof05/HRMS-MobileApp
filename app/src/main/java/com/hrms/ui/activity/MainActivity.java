package com.hrms.ui.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;

import com.hrms.R;
import com.hrms.ui.base.BaseActivity;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends BaseActivity {
    private Timer mTimer;
    private boolean apiResFound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler handler = new Handler();
        handler.postDelayed(() -> {
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
            finish();
            }, 3000);
    }
    @Override
    public void okDialogClick(int Id) {
    }
    @Override
    public void cancelDialogClick(int Id) {
    }
    @Override
    public void onLocationChanged(@NonNull Location location) {
    }
}