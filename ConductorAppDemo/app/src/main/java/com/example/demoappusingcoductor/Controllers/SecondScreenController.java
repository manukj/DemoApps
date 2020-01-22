package com.example.demoappusingcoductor.Controllers;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;

import com.bluelinelabs.conductor.Controller;
import com.example.demoappusingcoductor.R;
import com.example.demoappusingcoductor.databinding.SecondScreenBinding;

public class SecondScreenController extends Controller{

    SecondScreenBinding binding;

    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        binding = DataBindingUtil.inflate(inflater, R.layout.second_screen, container, false);
        return binding.getRoot();
    }

}
