package com.example.android.astridshofi_1202154353_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class Menu extends AppCompatActivity {

    //membuat daftar
    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu); //menapilkan layout menu
        dummiesData(); //objek
        //mengambil handler untuk RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        //membuat adapter dan menyediakan data untuk ditampilkan
        mAdapter = new MenuAdapter(this, foods, priceses, photos);
        //Connect adapter dengan RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        //Menetapkan RecyclerView default layout manager
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    //daftar makanan,harga,dan foto
    private void dummiesData(){
        for (int i = 0;i < 3; i++){
            foods.add("Kentang Goreng");
            foods.add("Tahu Gejrot");
            foods.add("Sate Kerang");
            foods.add("Salmon");
            foods.add("Rawon");
            foods.add("Ice Cream Goreng");
            foods.add("Ayam Geprek");

            priceses.add(25000);
            priceses.add(25000);
            priceses.add(30000);
            priceses.add(45000);
            priceses.add(40000);
            priceses.add(20000);
            priceses.add(35000);

            photos.add(R.drawable.kentang);
            photos.add(R.drawable.tahu);
            photos.add(R.drawable.kerang);
            photos.add(R.drawable.salmon);
            photos.add(R.drawable.rawon);
            photos.add(R.drawable.icecream);
            photos.add(R.drawable.ayam);
        }
    }
}
