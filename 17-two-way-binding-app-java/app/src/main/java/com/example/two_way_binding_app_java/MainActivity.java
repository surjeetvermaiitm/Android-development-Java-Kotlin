package com.example.two_way_binding_app_java;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.mastercoding.databindingapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private MyClickHandler myClickHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Data Binding with TextView
        Person p1 = new Person("Jack","jack@gmail.com");

        activityMainBinding = DataBindingUtil.setContentView(
                this, R.layout.activity_main);

        activityMainBinding.setPerson(p1);


        // Binding the Handler for Click Events
        myClickHandler = new MyClickHandler(this,activityMainBinding);
        activityMainBinding.setClickHandler(myClickHandler);






    }
}