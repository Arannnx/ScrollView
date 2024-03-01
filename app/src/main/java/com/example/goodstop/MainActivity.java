package com.example.goodstop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public CardView facebook, twitter, googlemap, instagram, telegram, messenger, binance, linkedin, discord, kiwi;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        facebook = (CardView) findViewById(R.id.facebook);
        facebook.setOnClickListener(this::onClick);

        twitter = (CardView) findViewById(R.id.twitter);
        twitter.setOnClickListener(this::onClick);

        googlemap = (CardView) findViewById(R.id.googlemap);
        googlemap.setOnClickListener(this::onClick);

        instagram = (CardView) findViewById(R.id.instagram);
        instagram.setOnClickListener(this::onClick);

        telegram = (CardView) findViewById(R.id.telegram);
        telegram.setOnClickListener(this::onClick);

        messenger = (CardView) findViewById(R.id.messenger);
        messenger.setOnClickListener(this::onClick);

        binance = (CardView) findViewById(R.id.binance);
        binance.setOnClickListener(this::onClick);

        linkedin = (CardView) findViewById(R.id.linkedin);
        linkedin.setOnClickListener(this::onClick);

        discord = (CardView) findViewById(R.id.discord);
        discord.setOnClickListener(this::onClick);

        kiwi = (CardView) findViewById(R.id.kiwi);
        kiwi.setOnClickListener(this::onClick);


    }

    public void openActivity2() {
        Intent intent = new Intent(this, ButtonIntent.class);
        startActivity(intent);

    }

    public void onClick(View view) {
        Intent i;

        if (view.getId() == R.id.facebook) {
            i = new Intent(this, Facebook.class);
            startActivity(i);
        }
        else if (view.getId() == R.id.twitter) {
            i = new Intent(this, Twitter.class);
            startActivity(i);
        }
        else if (view.getId() == R.id.googlemap) {
            i = new Intent(this, GoogleMap.class);
            startActivity(i);
        }
        else if (view.getId() == R.id.instagram) {
            i = new Intent(this, Instagram.class);
            startActivity(i);
        }
        else if (view.getId() == R.id.telegram) {
            i = new Intent(this, Telegram.class);
            startActivity(i);
        }
        else if (view.getId() == R.id.messenger) {
            i = new Intent(this, Messenger.class);
            startActivity(i);
        }
        else if (view.getId() == R.id.binance) {
            i = new Intent(this, Binance.class);
            startActivity(i);
        }
        else if (view.getId() == R.id.linkedin) {
            i = new Intent(this, Linkedin.class);
            startActivity(i);
        }
        else if (view.getId() == R.id.discord) {
            i = new Intent(this, Discord.class);
            startActivity(i);
        }
        else if (view.getId() == R.id.kiwi) {
            i = new Intent(this, Kiwi.class);
            startActivity(i);
        }


    }


}