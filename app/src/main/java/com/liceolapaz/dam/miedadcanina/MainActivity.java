package com.liceolapaz.dam.miedadcanina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
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

        EditText age_edit = findViewById(R.id.age_edit);
        TextView result_text = findViewById(R.id.result_text);
        Button boton = findViewById(R.id.boton);


        boton.setOnClickListener(view -> {
            String age = age_edit.getText().toString();
            if(!age.isEmpty()){
                int ageInt = Integer.parseInt(age);

                int resultado = ageInt * 7;
                String resultString = "Eres consciente de que 1 año de persona equivale a 7 años de perro, pues si fueses un perro, tu edad sería de " + resultado + " años.";
                result_text.setText(resultString);
            }else{
                Log.d("MainActivity", "El campo edad está vacío.");
                //result_text.setText("El campo edad está vacío.");
                        Toast.makeText(this, "El campo edad está vacío.",Toast.LENGTH_SHORT).show();
            }


        });

    }
}