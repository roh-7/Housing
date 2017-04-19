package com.example.housing.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.housing.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button login = (Button) findViewById(R.id.login_button);
        final EditText emailEdit = (EditText) findViewById(R.id.email_edit_text);
        final EditText passwordEdit = (EditText) findViewById(R.id.password_edit_text);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emailEdit.getText().toString();
                String password = passwordEdit.getText().toString();
                startActivity(new Intent(LoginActivity.this,HomeActivity.class));
            }
        });
    }
}
