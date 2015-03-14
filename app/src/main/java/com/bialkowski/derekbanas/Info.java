package com.bialkowski.derekbanas;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;


public class Info extends ActionBarActivity {

    private TextView imie;
    private TextView nazwisko;
    private TextView stars;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        context = this.getApplicationContext();

        this.imie = (TextView) findViewById(R.id.imieID);
        this.nazwisko = (TextView) findViewById(R.id.nazwiskoID);
        this.stars = (TextView) findViewById(R.id.id_RatingField);

        Bundle bundle = this.getIntent().getExtras();
        String temporary = bundle.getString("usrEntered");
        String temporary2 = bundle.getString("stars");

        this.nazwisko.setText(temporary);
        this.stars.setText(temporary2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_info, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
