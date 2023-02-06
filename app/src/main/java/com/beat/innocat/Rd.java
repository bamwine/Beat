package com.beat.innocat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rd extends AppCompatActivity implements View.OnClickListener {

    private Button radoi;
    private Button lineup;
    private Button events;
    private Button contact;
    private Button lines;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("");

        radoi=(Button)findViewById(R.id.radoi);
        lineup=(Button)findViewById(R.id.lineup);
        events=(Button)findViewById(R.id.events);       
        contact=(Button)findViewById(R.id.contact);
        lines=(Button)findViewById(R.id.lines);
       


        radoi.setOnClickListener(this);
        lineup.setOnClickListener(this);
        events.setOnClickListener(this);       
        contact.setOnClickListener(this);
        lines.setOnClickListener(this);
       

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.radoi:
                Intent in = new Intent(Rd.this, Rl.class);
                startActivity(in);
                break;



        }
    }}