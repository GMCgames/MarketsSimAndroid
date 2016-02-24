package com.gmcgames.simmarkets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SimMarketsMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sim_markets_main);

        findViewById(R.id.buttonTestLogin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }

        });
        findViewById(R.id.buttonTestTab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(SimMarketsMainActivity.this, TabActivity.class);
                startActivity(i);
            }

        });
    }

}
