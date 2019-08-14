package com.example.keterampilan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RecommendActtivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend_acttivity);
        this.setTitle("Recommended Book");

        Button tombol1 = (Button) findViewById(R.id.btn1);
        Button tombol2 = (Button) findViewById(R.id.btn2);
        Button tombol3 = (Button) findViewById(R.id.btn3);
        Button tombol4 = (Button) findViewById(R.id.btn4);
        Button tombol5 = (Button) findViewById(R.id.btn5);

        tombol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hujan Berhasil Di Tambahkan Kedalam Wishlist",Toast.LENGTH_LONG).show();
            }
        });

        tombol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Negeri Di Ujung Tanduk Berhasil Di Tambahkan Kedalam Wishlist",Toast.LENGTH_LONG).show();
            }
        });

        tombol3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hafalan Shalat Delisa Berhasil Di Tambahkan Kedalam Wishlist",Toast.LENGTH_LONG).show();
            }
        });

        tombol4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Eliana Berhasil Di Tambahkan Kedalam Wishlist",Toast.LENGTH_LONG).show();
            }
        });

        tombol5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Negeri Para Bedebah Berhasil Di Tambahkan Kedalam Wishlist",Toast.LENGTH_LONG).show();
            }
        });

    }
}
