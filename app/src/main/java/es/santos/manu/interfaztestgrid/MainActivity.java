package es.santos.manu.interfaztestgrid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import es.santos.manu.interfaztestgrid.adapter.GridAdapter;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    GridLayoutManager layoutManager;

    private String textosLista[] ={
            "iluminación","cámaras","aparatos electrónicos","calefacción","garage","agua","cocina","ventanas"
    };

    private int imagenesId[] = {
            R.drawable.bombilla,R.drawable.cam,R.drawable.lavadora,R.drawable.estufa,
            R.drawable.garage,R.drawable.grifo,R.drawable.cocina,R.drawable.persiana
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.interfaceGrid);
        layoutManager = new GridLayoutManager(MainActivity.this,2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        GridAdapter gridAdapter = new GridAdapter(MainActivity.this,imagenesId,textosLista);
        recyclerView.setAdapter(gridAdapter);
    }
}
