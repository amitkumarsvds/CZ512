package com.company.samplepunit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText mEdtMobileNumber;
    private Button mBtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUi();

        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getMobileNumber = mEdtMobileNumber.getText().toString();
                if (getMobileNumber.length() < 10) {
                    Toast.makeText(MainActivity.this, "Please enter the mobile number", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Success::" + getMobileNumber, Toast.LENGTH_LONG).show();
                    startActivity(new Intent(MainActivity.this,Home.class));
                }

            }
        });


    }

    /**
     * Set the Ui elements from the XML class
     */
    private void setUi() {
        mEdtMobileNumber = findViewById(R.id.edtMobileNumber);
        mBtnLogin = findViewById(R.id.btnLogin);
    }
}
