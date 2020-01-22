package com.example.demoappusingcoductor.Controllers;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;

import com.bluelinelabs.conductor.Controller;
import com.bluelinelabs.conductor.RouterTransaction;
import com.example.demoappusingcoductor.R;
import com.example.demoappusingcoductor.View.EventHandler;
import com.example.demoappusingcoductor.databinding.FirstScreenBinding;

public class FirstScreenController extends Controller  {

    FirstScreenBinding binding;

    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        binding = DataBindingUtil.inflate(inflater, R.layout.first_screen, container, false);

        binding.goToSecondScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getRouter().pushController(RouterTransaction.with(new SecondScreenController()));
            }
        });
        return binding.getRoot();
    }


}
