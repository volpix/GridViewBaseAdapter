package mx.edu.isc.tesoem.karm.gridviewbaseadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gvdatos;
    ArrayList<String> arreglo = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gvdatos = findViewById(R.id.gvdatos);
        contenido contenidoobj = new contenido(arreglo,this);
        gvdatos.setAdapter(contenidoobj);

        arreglo.add("Gera");
        arreglo.add("Alejandro");
        arreglo.add("Angel");
        arreglo.add("Kevin");

    }

}
