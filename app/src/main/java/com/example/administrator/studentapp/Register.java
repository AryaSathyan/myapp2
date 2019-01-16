package com.example.administrator.studentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    EditText name,admno,rollno,colg,place,stid,pass,confirmpass;
    Button b1,b2;
    String nm,adno,rno,cl,pl,sid,p,cp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name = (EditText) findViewById(R.id.name);
        admno = (EditText) findViewById(R.id.Admisionno);
        rollno = (EditText) findViewById(R.id.rollno);
        colg = (EditText) findViewById(R.id.clg);
        place = (EditText) findViewById(R.id.place);
        stid = (EditText) findViewById(R.id.sid);
        pass = (EditText) findViewById(R.id.pass);
        confirmpass = (EditText) findViewById(R.id.confirm);
        b1 = (Button) findViewById(R.id.reg);
        b2 = (Button) findViewById(R.id.alr);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nm = name.getText().toString();
                adno = admno.getText().toString();
                rno = rollno.getText().toString();
                cl = colg.getText().toString();
                pl = place.getText().toString();
                sid = stid.getText().toString();
                p = pass.getText().toString();
                cp = confirmpass.getText().toString();

                Toast.makeText(getApplicationContext(), nm, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), adno, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), rno, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), cl, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), pl, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), sid, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), p, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), cp, Toast.LENGTH_LONG).show();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Login.class);
                startActivity(i);
            }
        });

        }
    }