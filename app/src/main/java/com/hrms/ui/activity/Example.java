package com.hrms.ui.activity;

import android.location.Location;
import android.os.Bundle;

import androidx.annotation.NonNull;

import com.hrms.R;
import com.hrms.ui.base.BaseActivity;

import java.util.Timer;

public class Example extends BaseActivity {
    private Timer mTimer;
    private boolean apiResFound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example);

    }

    @Override
    public void onLocationChanged(@NonNull Location location) {

    }

    @Override
    public void okDialogClick(int Id) {

    }

    @Override
    public void cancelDialogClick(int Id) {

    }
}
