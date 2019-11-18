package com.example.crewr.myandroidapplication.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.*;
import android.widget.EditText;
import android.widget.Toast;
import android.app.*;

import java.sql.Connection;

public class MainActivity extends AppCompatActivity {
    private Button button;
    Button b1, b2;
    EditText ed1, ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);
        // setContentView(R.layout.activity_main_registration);
        //setContentView(R.layout.portfolio);
        final CustomerDAO cd = new CustomerDAOImpl();
        b1 = (Button) findViewById(R.id.btnLogin);
        ed1 = (EditText) findViewById(R.id.txtUserName);
        ed2 = (EditText) findViewById(R.id.txtPassword);
        Customer c = new Customer();
        final String userName= c.getUserName();
        final String pass = c.getPassword();
        c=cd.getCustomer(userName, pass);
        final Customer finalC = c;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userName = ed1.getText().toString();
                String pass = ed2.getText().toString();
             // if ((b1.equals("Login") && ed1 != null && ed2 != null)) {

                //     Intent intent = new Intent(getApplicationContext(), MainActivityPortfolio.class);
                //   startActivity(intent);
                // }
                //  Intent intent = new Intent(getApplicationContext(), MainActivityPortfolio.class );
                //  startActivity(intent);
                   if(cd!= null && cd.getCustomer(userName,pass)!= null) {
              //  if (b1.equals("Login")&& finalC!= null && finalC.getUserName()!= null) {

                    Toast.makeText(getApplicationContext(), "Redirecting...", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getApplicationContext(), MainActivityPortfolio.class);
                    startActivity(intent);
                }
                //else if(userName==null && pass==null){
                //  Toast.makeText(getApplicationContext(), "Please Enter your Credentials",Toast.LENGTH_LONG).show();
                //  }
                else {
                    Toast.makeText(getApplicationContext(), "Wrong/Empty Credentials", Toast.LENGTH_LONG).show();
                }




            }
        });
        button = (Button) findViewById(R.id.btnRegistration);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivityRegistration.class);
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.btnClear);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
                ed2.setText("");
            }
        });

    }
}




