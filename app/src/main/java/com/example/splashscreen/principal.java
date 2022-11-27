package com.example.splashscreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

public class principal extends AppCompatActivity {
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        List items = new ArrayList();
        items.add(new lugares(R.drawable.registro, "Centro Historico", 230));
        items.add(new lugares(R.drawable.termales, "Zona Rural", 456));
        items.add(new lugares(R.drawable.deportes, "Deportes", 3));
        items.add(new lugares(R.drawable.parapente1, "Parapente",75656));
        items.add(new lugares(R.drawable.restaurante1, "Restaurantes",7887));
        items.add(new lugares(R.drawable.gastronomia, "gastronomia",7887));
        // Obtener el Recycler
        recycler = (RecyclerView) findViewById(R.id.reciclador2);
        recycler.setHasFixedSize(true);
// Usar un administrador para
        lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);
// Crear un nuevo adaptador
        adapter = new LugaresAdapter(items);
        recycler.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(this,"selecciono configuracion", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Intent intent = new Intent(principal.this, Principal.class);
                startActivity(intent);
                Toast.makeText(this,"selecciono buscar",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                Toast.makeText(this,"selecciono comprar",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item4:
                Intent intent2= new Intent(principal.this,MapsActivity.class);
                startActivity(intent2);
                Toast.makeText(this,"selecciono imtem",Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}