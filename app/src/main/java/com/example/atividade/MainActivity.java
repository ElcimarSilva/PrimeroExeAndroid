package com.example.atividade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.editTextTextPersonName2);
        Button botaoEnviar = (Button) findViewById(R.id.button);
        botaoEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {

                String nomeValue = nome.getText().toString();

                Intent intent = new Intent (MainActivity.this,  ActivitySobrenome.class);

                intent.putExtra("nome", nomeValue);
                startActivity(intent);
                finish();
            }
        });

    }
}