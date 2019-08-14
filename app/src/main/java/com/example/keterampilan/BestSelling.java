package com.example.keterampilan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BestSelling extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_selling);
        this.setTitle("Best Selling Book");


        Button tombol1 = (Button) findViewById(R.id.btn1);
        Button tombol2 = (Button) findViewById(R.id.btn2);
        Button tombol3 = (Button) findViewById(R.id.btn3);
        Button tombol4 = (Button) findViewById(R.id.btn4);
        Button tombol5 = (Button) findViewById(R.id.btn5);

        tombol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "That Night Berhasil Di Tambahkan Kedalam Wishlist",Toast.LENGTH_LONG).show();
            }
        });

        tombol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Sepasang Sepatu Tua Berhasil Di Tambahkan Kedalam Wishlist",Toast.LENGTH_LONG).show();
            }
        });

        tombol3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Septictank Berhasil Di Tambahkan Kedalam Wishlist",Toast.LENGTH_LONG).show();
            }
        });

        tombol4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Srimenanti Berhasil Di Tambahkan Kedalam Wishlist",Toast.LENGTH_LONG).show();
            }
        });

        tombol5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "A Poem I Wrote For You Berhasil Di Tambahkan Kedalam Wishlist",Toast.LENGTH_LONG).show();
            }
        });

    }
}
