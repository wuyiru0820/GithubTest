package com.example.yiru.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Activity1 extends AppCompatActivity {

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater info = getMenuInflater();
        info.inflate(R.menu.menu2, menu);
        return true;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);

    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.backbutton:
                Activity1.this.finish();
                break;

        }
        return true;
    }
}