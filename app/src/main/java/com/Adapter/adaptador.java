package com.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.Record.TipRecord;
import com.example.pc.tipcalc.R;

import java.util.ArrayList;

/**
 * Created by PC on 13/02/2017.
 */

public class adaptador extends RecyclerView.Adapter<adaptador.viewHolder> {


    ArrayList<TipRecord> list;
    Context contexto;
    public static class viewHolder extends RecyclerView.ViewHolder {

        private TextView monto;

         public viewHolder(View itemView) {
             super(itemView);
            monto=(TextView) itemView.findViewById(R.id.texto);
         }
     }


     public adaptador(Context context ,ArrayList<TipRecord> lista){
      this.contexto=context;
      this.list=lista;

     }

    @Override
    public viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view  =LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row,null,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(viewHolder holder, int position) {
       holder.monto.setText(String.valueOf(list.get(position).getBill()));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void add(TipRecord record ){
        list.add(0,record);
        notifyDataSetChanged();

    }
    public void clear( ){
        list.clear();
        notifyDataSetChanged();

    }



}
