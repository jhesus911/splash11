package com.example.splashscreen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.splashscreen.Modelo.Personas;

import java.util.List;

public class
PersonaAdapter extends
        RecyclerView.Adapter<PersonaAdapter.AnimeViewHolder> {
    private List<Personas> items;
    private LayoutInflater mInflater;
    private Context context;

    @NonNull
    @Override
    public AnimeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AnimeViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class AnimeViewHolder extends RecyclerView.ViewHolder {
        private List<Personas> items;
        public ImageView imagen;

        public TextView nombre;
        public TextView visitas;

        public AnimeViewHolder(View v) {
            super(v);
            imagen = (ImageView) v.findViewById(R.id.imagen);
            nombre = (TextView) v.findViewById(R.id.nombre);
            visitas = (TextView) v.findViewById(R.id.visitas);
        }
    }

    public void setItems(List<Personas> items){items = items;}
    public PersonaAdapter(List<Personas> items) {
        this.items = items;
    }
}

