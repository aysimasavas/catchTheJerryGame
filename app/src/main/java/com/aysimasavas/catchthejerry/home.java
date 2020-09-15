package com.aysimasavas.catchthejerry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void start(View view)
    {
        Intent intent=new Intent(home.this,MainActivity.class);
        finish();
        startActivity(intent);


    }

    public void exit(View view)
    {       finish();
            System.exit(0);
    }
}