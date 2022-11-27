package com.example.splashscreen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class LugaresAdapter extends
        RecyclerView.Adapter<LugaresAdapter.AnimeViewHolder>{
    private List<lugares> items;
    private LayoutInflater mInflater;
    private Context context;


    public static class AnimeViewHolder extends RecyclerView.ViewHolder {
        private  List<lugares> items;
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
    public void setItems(List<lugares> items){items = items;}
    public LugaresAdapter(List<lugares> items) {
        this.items = items;
    }
    @NonNull
    @Override
    public AnimeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int
            viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);
        return new AnimeViewHolder(v);
    }
    @Override
    public void onBindViewHolder(@NonNull AnimeViewHolder holder, int i) {
        holder.imagen.setImageResource(items.get(i).getImagen());
        holder.nombre.setText(items.get(i).getNombre());
        holder.visitas.setText("Visitas:"+String.valueOf(items.get(i).getVisitas()));
    }
    @Override
    public int getItemCount() {
        return items.size();
    }

}

