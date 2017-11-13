package com.example.singe.wnt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Credits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
    }

    public void backButton(View view){
        finish();
    }
}
