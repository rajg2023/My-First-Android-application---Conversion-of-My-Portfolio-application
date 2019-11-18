package com.example.crewr.myandroidapplication.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivityRegistration extends AppCompatActivity {
    private Button button;
    Button b1, b2, b3;
    EditText ed1, ed2,ed3,ed4,ed5,ed6;
    CustomerDAOImpl myDb;
    String uName, pass, fName, lName, email,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_registration);

        b1 = (Button) findViewById(R.id.btnLogin);
        ed1 = (EditText) findViewById(R.id.txtUserName);
        ed2 = (EditText) findViewById(R.id.txtPassword);
        ed3 = (EditText) findViewById(R.id.txtFirstName);
        ed4 = (EditText) findViewById(R.id.txtLastName);
        ed5 = (EditText) findViewById(R.id.txtEmail);
        ed6 = (EditText) findViewById(R.id.txtPhone);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uName = ed1.getText().toString();
                pass = ed2.getText().toString();
                fName = ed3.getText().toString();
                lName = ed4.getText().toString();
                email = ed5.getText().toString();
                phone = ed6.getText().toString();
                if(uName.isEmpty() || pass.isEmpty() ||fName.isEmpty() || lName.isEmpty()|| email.isEmpty()||phone.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Invalid/Empty Credentials", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Registration Successful", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class );
                    startActivity(intent);
                }
                button = (Button) findViewById(R.id.btnLogin);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    }
                });
                button = (Button) findViewById(R.id.btnClear);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ed1.setText("");
                        ed2.setText("");
                        ed3.setText("");
                        ed4.setText("");
                        ed5.setText("");
                        ed6.setText("");
                    }
                });


            }
        });




    }

}
