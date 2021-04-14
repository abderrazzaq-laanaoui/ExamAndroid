package com.example.exam.presentation.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.exam.R;
import com.example.exam.business.Services;
import com.example.exam.model.Ville;
import com.example.exam.utils.MyContext;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private Button button;
    EditText qtyText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         spinner = (Spinner) findViewById(R.id.spinner);
            ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(getApplicationContext(),  android.R.layout.simple_spinner_dropdown_item,
                        ((MyContext)getApplicationContext()).getServices().getVillesNames());
        adapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData();

            }
        });
    }

    public void sendData(){
        Services services =  ((MyContext)getApplicationContext()).getServices();
        double qty = Double.parseDouble(qtyText.getText().toString());
        Ville ville = services.GetVilleByName(spinner.getSelectedItem().toString());
       double total = services.CalculerMontant(qty,ville);
        Intent intent = new Intent (MainActivity.this,ResultActivity.class);
        intent.putExtra("total",total);
        startActivity(intent); }


}