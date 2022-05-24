package com.hrms.ui.activity;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

import com.hrms.R;
import com.hrms.databinding.ActivityLoginBinding;
import com.hrms.ui.base.BaseActivity;

public class LoginActivity extends BaseActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        /*Button next=findViewById(R.id.btnnext);
        next.setOnClickListener(this);*/
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
           /* case R.id.btnnext:
                startActivity(new Intent(LoginActivity.this, OtpActivity.class));
                break;*/
        }

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
