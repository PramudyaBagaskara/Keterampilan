package com.example.keterampilan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Import extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_import);
        this.setTitle("Import Book");

        Button tombol1 = (Button) findViewById(R.id.btn1);
        Button tombol2 = (Button) findViewById(R.id.btn2);
        Button tombol3 = (Button) findViewById(R.id.btn3);
        Button tombol4 = (Button) findViewById(R.id.btn4);
        Button tombol5 = (Button) findViewById(R.id.btn5);

        tombol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "A Sun Is Also The Star Berhasil Di Tambahkan Kedalam Wishlist",Toast.LENGTH_LONG).show();
            }
        });

        tombol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Girl Who Drank The Moon Berhasil Di Tambahkan Kedalam Wishlist",Toast.LENGTH_LONG).show();
            }
        });

        tombol3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "First & Then Berhasil Di Tambahkan Kedalam Wishlist",Toast.LENGTH_LONG).show();
            }
        });

        tombol4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Girl Stop Apologizing Berhasil Di Tambahkan Kedalam Wishlist",Toast.LENGTH_LONG).show();
            }
        });

        tombol5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "A World Without You Berhasil Di Tambahkan Kedalam Wishlist",Toast.LENGTH_LONG).show();
            }
        });



    }
}
