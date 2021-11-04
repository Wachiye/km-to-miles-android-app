package com.sirah.km2miles;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ConvertActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);

        EditText txtKm = (EditText) findViewById(R.id.txtKm);
        TextView lblMiles1 = (TextView) findViewById(R.id.lblMiles1);
        Button btnConvert = (Button) findViewById(R.id.btnConvert);
        Button btnQuit = (Button) findViewById(R.id.btnQuit);

        final double MILESPERKM = 1.60934;

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get text from txtKm
                String km = txtKm.getText().toString();
                //convert the text to double
                    Double kmToDouble = Double.parseDouble(km);
                    Double kmToMiles = kmToDouble / MILESPERKM;

                    //display miles
                    lblMiles1.setText(kmToMiles.toString());

                    Toast.makeText(ConvertActivity.this,kmToMiles.toString() + " Miles", Toast.LENGTH_LONG).show();
            }
        });

        btnQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });

    }

}
