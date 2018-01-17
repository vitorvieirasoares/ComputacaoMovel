package com.example.vitorsoares.computacaomovel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends Activity {

    private Button button;

    DatabaseHelper helper = new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        button = (Button)findViewById(R.id.btn_login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText a = (EditText)findViewById(R.id.edt_user);
                String str = a.getText().toString();
                EditText b = (EditText)findViewById(R.id.edt_password);
                String pass = b.getText().toString();

                String password = helper.searchPass(str);

                if (pass.equals(password)) {
                    Intent i = new Intent(LoginPage.this, Weather.class);
                    i.putExtra("Username", str);
                    startActivity(i);
                }
                else {
                    Toast temp = Toast.makeText(LoginPage.this, "Username and Password's don't match!!" , Toast.LENGTH_LONG);
                }
            }
        });

        button = (Button)findViewById(R.id.btn_register);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginPage.this, Register.class);
                startActivity(i);
            }
        });
    }


}
