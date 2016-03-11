package com.zyx.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.zyx.databinding.databinding.ActivityMain22Binding;

public class Main22Activity extends AppCompatActivity {

    private ObserverFieldUser  mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //        注意此处的写法
        ActivityMain22Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_main22);
        mUser = new ObserverFieldUser ("yongx", "zheng");
        binding.setUser(mUser);
    }

    public void changefirstName(View view) {
        mUser.firstName.set("nihao");
    }



}
