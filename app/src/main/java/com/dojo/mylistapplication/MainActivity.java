package com.dojo.mylistapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] listaNomes = {"Felpudo","Fofura","Lesmo","Bugada","Uruca","Racing","iOS","Android","RealidadeAumentada",
            "Sound FX","3D Studio Max", "Games"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> meuAdaptador = new ArrayAdapter<String>(getApplicationContext()
                ,android.R.layout.simple_list_item_1,android.R.id.text1,listaNomes);

        ListView minhaLista = findViewById(R.id.minhaLista);
        minhaLista.setAdapter(meuAdaptador);

        minhaLista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,""+listaNomes[position],Toast.LENGTH_SHORT).show();
            }
        });
    }
}