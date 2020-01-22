package com.example.demoappusingcoductor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Conductor;
import com.bluelinelabs.conductor.Router;
import com.bluelinelabs.conductor.RouterTransaction;
import com.example.demoappusingcoductor.Controllers.FirstScreenController;
import com.example.demoappusingcoductor.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    Router router;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        ViewGroup container = binding.controllerContainer;

        router = Conductor.attachRouter(this, container, savedInstanceState);

        if (!router.hasRootController()) {
            router.setRoot(RouterTransaction.with(new FirstScreenController()));
        }

    }
    @Override
    public void onBackPressed() {
        if (!router.handleBack()) {
            super.onBackPressed();
        }
    }

}
