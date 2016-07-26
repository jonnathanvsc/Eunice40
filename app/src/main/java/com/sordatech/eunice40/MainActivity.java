package com.sordatech.eunice40;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sordatech.eunice40.perfilbaby.PerfilbabyActivity;
import com.sordatech.eunice40.perfileunice.PerfileuniceActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnperfileunice = (Button) findViewById(R.id.btnperfileunice);
        btnperfileunice.setOnClickListener(this);

        Button btnperfilbaby = (Button) findViewById(R.id.btnperfilbaby);
        btnperfilbaby.setOnClickListener(this);

        Button btnpropostas = (Button) findViewById(R.id.btnpropostas);
        btnpropostas.setOnClickListener(this);

        Button btneventos = (Button) findViewById(R.id.btneventos);
        btneventos.setOnClickListener(this);

        Button btnfotos = (Button) findViewById(R.id.btnfotos);
        btnfotos.setOnClickListener(this);

        Button btnmidias = (Button) findViewById(R.id.btnmidias);
        btnmidias.setOnClickListener(this);

        Button btnfalecom = (Button) findViewById(R.id.btnfalecom);
        btnfalecom.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() ==R.id.btnperfileunice){
            Intent it = new Intent(this, PerfileuniceActivity.class);
            startActivity(it);
        }
        else if (view.getId() ==R.id.btnperfilbaby){
            Intent it = new Intent(this, PerfilbabyActivity.class);
            startActivity(it);
        }
        else if (view.getId() ==R.id.btnpropostas){
            Intent it = new Intent(this, PropostasActivity.class);
            startActivity(it);
        }
        else if (view.getId() ==R.id.btneventos){
            Intent it = new Intent(this, EventosActivity.class);
            startActivity(it);
        }
        else if (view.getId() ==R.id.btnfotos){
            Intent it = new Intent(this, FotosActivity.class);
            startActivity(it);
        }
        else if (view.getId() ==R.id.btnmidias){
            Intent it = new Intent(this, MidiasActivity.class);
            startActivity(it);
        }
        else if (view.getId() ==R.id.btnfalecom){
            Intent it = new Intent(this, FalecomActivity.class);
            startActivity(it);
        }

    }
}
