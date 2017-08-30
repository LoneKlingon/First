package com.example.anthonyyoubisobodker.first;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText percentage;
    EditText number;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*Equivalent of Setting IBoutlets
            Type must be explicitly mentioned to create view
        */
        Button calculateBtn = (Button) findViewById(R.id.calculateBtn);
        percentage = (EditText) findViewById(R.id.percentageEditView);
        number = (EditText) findViewById(R.id.numEditView);
        result = (TextView) findViewById(R.id.resultTextView);

        /*
            Equivalent of Setting IBAction for button pressed
         */
        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Float per;
                Float num; //denominator
                Float r; //result


                per = Float.parseFloat(percentage.getText().toString());
                per = per / 100;
                num = Float.parseFloat(number.getText().toString());

                r = per * num;

                result.setText(r.toString());


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
