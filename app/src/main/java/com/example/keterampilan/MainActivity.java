package com.example.keterampilan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView c_exit;
    private CardView c_buy;
    private CardView c_recc;
    private CardView c_best;
    private CardView c_new;
    private CardView c_import;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Main Menu");

        c_exit = findViewById(R.id.card6);

        c_buy = findViewById(R.id.card1);
        c_buy.setOnClickListener(this);

        c_recc = findViewById(R.id.card2);
        c_recc.setOnClickListener(this);

        c_best = findViewById(R.id.card3);
        c_best.setOnClickListener(this);

        c_new = findViewById(R.id.card4);
        c_new.setOnClickListener(this);

        c_import = findViewById(R.id.card5);
        c_import.setOnClickListener(this);

        c_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.card1:
                Intent intent = new Intent( MainActivity.this, BuyActivity.class);
                startActivity(intent);

                break;

            case R.id.card2:
                Intent intent2 = new Intent(MainActivity.this, RecommendActtivity.class);
                startActivity(intent2);

                break;

            case R.id.card3:
                Intent intent3 = new Intent(MainActivity.this, BestSelling.class);
                startActivity(intent3);

                break;

            case R.id.card4:
                Intent intent4 = new Intent(MainActivity.this, New.class);
                startActivity(intent4);

                break;

            case R.id.card5:
                Intent intent5 = new Intent(MainActivity.this, Import.class);
                startActivity(intent5);

                break;
        }
    }
}
