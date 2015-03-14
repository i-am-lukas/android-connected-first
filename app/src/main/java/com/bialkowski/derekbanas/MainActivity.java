package com.bialkowski.derekbanas;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private TextView heading;
    private TextView simpleText;
    private Button button;
    private Context context;
    private EditText nameEntered;
    private RatingBar rating1;
    private RatingBar rating2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.context = this.getApplicationContext();

        nameEntered = (EditText) this.findViewById(R.id.idEnterName);
        heading = (TextView) this.findViewById(R.id.headingid);
        simpleText = (TextView) this.findViewById(R.id.simpletextid);
        button = (Button) this.findViewById(R.id.submitbuttonid);
        rating1 = (RatingBar) this.findViewById(R.id.ratingBar);
        rating2 = (RatingBar) this.findViewById(R.id.ratingBar2);


        /*button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Przycisk działa", Toast.LENGTH_LONG).show();
            }
        });*/
        button.setOnClickListener(this);

    }

    public void onClick(View view) {

        Intent intencja = new Intent(this.context, Info.class);

        String nameEntered = this.nameEntered.getText().toString().toUpperCase();
        String startString = (this.rating1.getNumStars()+this.rating2.getNumStars()) + " stars";

        intencja.putExtra("usrEntered", nameEntered);
        intencja.putExtra("stars", startString);

        this.startActivity(intencja);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
