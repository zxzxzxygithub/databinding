package com.zyx.databinding;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.zyx.databinding.databinding.ActivityMain2Binding;

public class Main2Activity extends AppCompatActivity {

    private ObseverableUser mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main2);


//        注意此处的写法
        ActivityMain2Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_main2);
        mUser = new ObseverableUser("yongx", "zheng");
        binding.setUser(mUser);

    }

    public void changefirstName(View view) {
        mUser.setFirstName("nunu");
    }

    public void main22(View view) {
        startActivity(new Intent(this, Main22Activity.class));
    }

}
