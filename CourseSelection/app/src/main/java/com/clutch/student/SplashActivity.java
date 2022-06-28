package com.clutch.student;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //获取控件

        TextView tvVersion =findViewById(R.id.tv_version);

//获取程序的版本号

        try{

            PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(),0);

            tvVersion.setText("V"+packageInfo.versionName);

        } catch (PackageManager.NameNotFoundException e) {

            e.printStackTrace();

        }

//定义计时器

        Timer timer = new Timer();

//开启字线程 让引导页跳转至登录面

        TimerTask task =new TimerTask() {

            @Override

            public void run() {

                Intent intent = new Intent(SplashActivity.this,LoginActivity.class);

                startActivity(intent);

            }

        };

        timer.schedule(task,2000);
    }
}
