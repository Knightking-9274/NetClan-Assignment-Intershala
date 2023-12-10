package com.example.netclan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class Refine extends AppCompatActivity {

    private ArrayAdapter<String> adpt;

    private Spinner spinner;
    private String[] str = new String[]{"Available| Hey Let Us Connect","Away| Stay Discrete and watch","Busy| Do Not Disturb |Will Catchup Later","SOS|Emergency! Need Asistance! HeLP"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refine);

        spinner = findViewById(R.id.spinner1);

        adpt = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,str);
        spinner.setAdapter(adpt);

        spinner.setSelection(0);



    }
}