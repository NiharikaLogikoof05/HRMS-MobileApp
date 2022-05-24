package com.hrms.ui.activity;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

import com.hrms.R;
import com.hrms.databinding.ActivityLoginBinding;
import com.hrms.databinding.ActivityOtpBinding;
import com.hrms.ui.base.BaseActivity;

public class OtpActivity extends BaseActivity implements View.OnClickListener{
    private ActivityOtpBinding binding;

    @Override
    protected void init() {
        layoutId = R.layout.activity_otp;
    }

    @Override
    protected void setUpUi(Bundle savedInstanceState, ViewDataBinding viewDataBinding) {
        binding = (ActivityOtpBinding) viewDataBinding;
        binding.edotp1.addTextChangedListener(new GenericTextWatcher(binding.edotp1));
        binding.edotp2.addTextChangedListener(new GenericTextWatcher(binding.edotp2));
        binding.edotp3.addTextChangedListener(new GenericTextWatcher(binding.edotp3));
        binding.edotp4.addTextChangedListener(new GenericTextWatcher(binding.edotp4));

        binding.btnloogin.setOnClickListener(this);
        binding.ivback.setOnClickListener(this);


        binding.edotp1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // slideUp(binding.llLogin);
                return false;
            }
        });

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnnext:

                break;
            case R.id.ivback:
                startActivity(new Intent(OtpActivity.this, LoginActivity.class));
                break;
        }
    }
    public class GenericTextWatcher implements TextWatcher {
        private View view;

        private GenericTextWatcher(View view) {
            this.view = view;
        }

        @Override
        public void afterTextChanged(Editable editable) {
            String text = editable.toString();
            switch (view.getId()) {
                case R.id.edotp1:
                    if (text.length() == 1)
                        binding.edotp2.requestFocus();
                    break;

                case R.id.edotp2:
                    if (text.length() == 1)
                        binding.edotp3.requestFocus();
                    else if (text.length() == 0)
                        binding.edotp1.requestFocus();
                    break;

                case R.id.edotp3:
                    if (text.length() == 1)
                        binding.edotp4.requestFocus();
                    else if (text.length() == 0)
                        binding.edotp2.requestFocus();
                    break;

                case R.id.edotp4:
                    if (text.length() == 0)
                        binding.edotp3.requestFocus();
                    break;
            }
        }

        @Override
        public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
            // TODO Auto-generated method stub
            //Toast.makeText(getApplicationContext(),"test",Toast.LENGTH_LONG).show();

        }

        @Override
        public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
            // TODO Auto-generated method stub
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
