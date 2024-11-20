package com.example.rejestracja;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private Button Confirm;
    private EditText Email;
    private EditText Password;
    private EditText RepeatPassword;
    private TextView ChangeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Confirm = findViewById(R.id.Confirm);
        Email = findViewById(R.id.Email);
        Password = findViewById(R.id.Password);
        RepeatPassword = findViewById(R.id.RepeatPassword);
        ChangeText = findViewById(R.id.ChangeText);

        Confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String EmailText = Email.getText().toString().trim();
                String PasswordText = Password.getText().toString().trim();
                String ConfirmPasswordText = RepeatPassword.getText().toString().trim();

                if(EmailText.contains("@")) {
                    if(PasswordText.equals(ConfirmPasswordText)) {
                        ChangeText.setText("Witaj " + EmailText);
                    } else {
                        ChangeText.setText("Hasła się różnią");
                    }
                } else {
                    ChangeText.setText("Nieprawidłowy adres e-mail");
                }
            }
        });

    }
}