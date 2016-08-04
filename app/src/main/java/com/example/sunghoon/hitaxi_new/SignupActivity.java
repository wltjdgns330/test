package com.example.sunghoon.hitaxi_new;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class SignupActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        String[] str = getResources().getStringArray(R.array.spinnerArray);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_dropdown_item,str);
        Spinner spi = (Spinner) findViewById(R.id.spinner);
        spi.setAdapter(adapter);

        Button btn = (Button)findViewById(R.id.signup_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignupActivity.this,MainTabActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }


}
