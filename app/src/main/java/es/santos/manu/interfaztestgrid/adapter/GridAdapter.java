package es.santos.manu.interfaztestgrid.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

// Necesito importar R al estar en otro paquete
import es.santos.manu.interfaztestgrid.R;


public class GridAdapter extends RecyclerView.Adapter<GridAdapter.GridHolder> {

    private Context context;
    private int imagenes[];
    private String textos[];

    public GridAdapter(Context context, int[] imagenes, String[] textos) {
        this.context = context;
        this.imagenes = imagenes;
        this.textos = textos;
    }

    @Override
    public GridHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_layout, null);
        GridHolder gridholder = new GridHolder(layout);

        return gridholder;
    }

    @Override
    public void onBindViewHolder(GridHolder holder, int position) {

        holder.img.setImageResource(imagenes[position]);
        holder.txt.setText(textos[position]);
    }

    @Override
    public int getItemCount() {
        return textos.length;
    }


    // Holder personalizado
    public static class GridHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txt;

        public GridHolder(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.imageView);
            txt = (TextView) itemView.findViewById(R.id.textView);
        }
    }
}
