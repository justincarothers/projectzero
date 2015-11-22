package com.justincarothersgmail.projectzero;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



public void app1(View view) {

    Toast.makeText(getApplicationContext(), "Opening Spotify Streamer...",
            Toast.LENGTH_LONG).show();

    }

    public void app2(View view) {

        Toast.makeText(getApplicationContext(), "OPening Scores...",
                Toast.LENGTH_LONG).show();

    }
    public void app3(View view) {

        Toast.makeText(getApplicationContext(), "Opening Library...",
                Toast.LENGTH_LONG).show();

    }
    public void app4(View view) {

        Toast.makeText(getApplicationContext(), "Opening Build It Bigger...",
                Toast.LENGTH_LONG).show();

    }
    public void app5(View view) {

        Toast.makeText(getApplicationContext(), "Opening XYZ Reader...",
                Toast.LENGTH_LONG).show();

    }
    public void app6(View view) {

        Toast.makeText(getApplicationContext(), "Opening Capstone Project...",
                Toast.LENGTH_LONG).show();

    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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
