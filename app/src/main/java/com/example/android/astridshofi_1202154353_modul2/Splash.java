package com.example.android.astridshofi_1202154353_modul2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        final Handler handler = new Handler(); //handler untuk mengirim dan memproses objek message
        handler.postDelayed(new Runnable() {
            @Override
            public void run() { //delayed untuk memperlama objek
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        }, 3000L); //3000 L = 3 detik lama waktu splash ditampilkan
    }
}
