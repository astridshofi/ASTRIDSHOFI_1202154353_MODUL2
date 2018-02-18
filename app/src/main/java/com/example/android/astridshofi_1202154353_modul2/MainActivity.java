package com.example.android.astridshofi_1202154353_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //menampilkan layout main activity
        Toast.makeText(this, "AstridShofi_1202154353", Toast.LENGTH_SHORT).show(); //membuat toast setelah splash
    }

    public void onClickOrder(View view) { //menampilkan radio button dine in atau takeaway
        if (((RadioButton)findViewById(R.id.rbt_DineIn)).isChecked()){ //jika dine in maka akan memanggil kelas DineIn
            Intent intent = new Intent(this, DineIn.class);
            startActivity(intent);
        }else if (((RadioButton)findViewById(R.id.rbt_TakeAway)).isChecked()){ //jika take away akan memanggil kelas TakeAway
            Intent intent = new Intent(this, TakeAway.class);
            startActivity(intent);
        }else{ //jika tidak memilih keduanya maka akan menampilkan toast dan harus memilih
            Toast.makeText(this,"Jenis Makanan belum dipilih",Toast.LENGTH_SHORT).show();
        }
    }
}
