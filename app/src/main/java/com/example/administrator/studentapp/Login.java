package com.example.administrator.studentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText ed1,ed2;
    Button b1,b2;
    String s1,s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ed1=(EditText)findViewById(R.id.sid);
        ed2=(EditText)findViewById(R.id.pass);
        b1=(Button)findViewById(R.id.login);
        b2=(Button)findViewById(R.id.reg);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=ed1.getText().toString();
                s2=ed2.getText().toString();
                if (s1.equals("mzc")&&s2.equals("college"))
                {
                    Intent i=new Intent(getApplicationContext(),WelcomeActivity.class);
                    startActivity(i);
            }
                else
                    Toast.makeText(getApplicationContext(),"error",Toast.LENGTH_LONG).show();
        };
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Register.class);
                startActivity(i);
            }
        });
    }
}
