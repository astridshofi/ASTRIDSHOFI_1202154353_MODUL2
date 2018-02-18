package com.example.android.astridshofi_1202154353_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DineIn extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in); //menampilkan layout dine in
        Spinner spinner = (Spinner) findViewById(R.id.spinner_table); //Membuat Spinner menu drop down

        //Mengembalikan tampilan untuk setiap objek dalam koleksi objek data dan digunakan widget antarmuke berbasis spinner
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.tables_array, android.R.layout.simple_spinner_item);
        //Menetapkan layout yang harus digunakan adaptor untuk menampilkan daftar pilihan spinner
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        //Adapter untuk spinner
        if (spinner != null) {
            spinner.setAdapter(adapter);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    //Jika di klik akan menampilkan kelas Menu
    public void onClickOrder(View view) {
        Intent intent = new Intent(this,Menu.class);
        startActivity(intent);
    }
}
