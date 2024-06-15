package com.example.egzaminrejestracja;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    EditText editPass1;
    EditText editPass2;
    TextView textWitaj;
    Button button;
    String haslo;
    String powtorzHaslo;
    String witaj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.textPodajEmail);
        editPass1 = (EditText) findViewById(R.id.textPodajHaslo);
        editPass2 = (EditText) findViewById(R.id.textPowtorzHaslo);
        textWitaj = (TextView) findViewById(R.id.textViewWitaj);
        button = (Button) findViewById(R.id.buttonZatwierdz);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                haslo = String.valueOf(editPass1.getText());
                powtorzHaslo = String.valueOf(editPass2.getText());
                witaj = String.valueOf(editText.getText());
                if(haslo.equals(powtorzHaslo) && witaj.contains("@")){
                    textWitaj.setText("Witaj " + witaj);
                }
                else{
                    textWitaj.setText("Nieprawidłowe hasło lub e-mail");
                }
            }
        });

    }
}