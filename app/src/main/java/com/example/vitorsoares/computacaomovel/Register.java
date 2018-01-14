package com.example.vitorsoares.computacaomovel;

import android.app.Activity;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.EditText;

public class Register extends Activity {

    DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

    }

    public void onRegisterClick (View v) {
        if (v.getId() == R.id.btn_regRegister) {
            EditText regName = (EditText)findViewById(R.id.edt_regName);
            EditText regUsername = (EditText)findViewById(R.id.edt_regUser);
            EditText regPassword = (EditText)findViewById(R.id.edt_regPass);

            String namestr = regName.getText().toString();
            String usernamestr = regUsername.getText().toString();
            String passwordstr = regPassword.getText().toString();

            contact c = new contact();
            c.setName(namestr);
            c.setUsername(usernamestr);
            c.setPassword(passwordstr);

            helper.insertContact();

        }

    }
}
