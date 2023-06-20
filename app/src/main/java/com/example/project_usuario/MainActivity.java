package com.example.project_usuario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView name = findViewById(R.id.editTextName);
        TextView lastName = findViewById(R.id.editTextLastName);
        TextView email = findViewById(R.id.editTextEmail);
        TextView password = findViewById(R.id.editTextTextPassword);

        Button botonCrearCuenta = findViewById(R.id.buttonCreateAccount);


        botonCrearCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String clickName = name.getText().toString();
                String clickLastName = lastName.getText().toString();
                String clickEmail = email.getText().toString();
                String clickPassword = password.getText().toString();

                String texto = "Usuario: " + clickName + " " + clickLastName + " " + "Email: " + clickEmail + " " + "Contraseña: " + clickPassword;

                Toast.makeText(getBaseContext(), texto, Toast.LENGTH_LONG).show();
            }
        });
    }
}