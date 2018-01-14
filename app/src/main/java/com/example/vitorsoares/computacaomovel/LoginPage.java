package com.example.vitorsoares.computacaomovel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;

public class LoginPage extends Activity {

    private String username;
    private int password;
    private Button login;
    private Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
    }

    public void onButtonClick (View v) {
        if (v.getId() == R.id.btn_login) {
            Intent i = new Intent(LoginPage.this, Display.class);
            i.putExtra()
            startActivity(i);
        }
    }
}
