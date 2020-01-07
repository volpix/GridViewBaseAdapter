package mx.edu.isc.tesoem.karm.gridviewbaseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class contenido extends BaseAdapter {
    ArrayList<String> arreglo;
    Context context;

    public contenido(ArrayList<String> arreglo, Context context) {
        this.arreglo = arreglo;
        this.context = context;
    }

    @Override
    public int getCount() {
        return arreglo.size();
    }

    @Override
    public Object getItem(int position) {
        return arreglo.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){

            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.elementos,null);

        }
        TextView txtnombre = convertView.findViewById(R.id.txtnombre);
        txtnombre.setText(arreglo.get(position));
        return convertView;
    }
}
