package com.example.singe.wnt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.content.Intent;

public class Menu extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.WNT.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    public void loadGameButton(){
        Intent intent = new Intent(this, LoadGame.class);
        startActivity(intent);


    }
    public void newGameButton(){


    }
    public void optionsButton(){


    }
    public void creditsButton(View view){
        Intent intent = new Intent(this, Credits.class);
        startActivity(intent);

    }

}
