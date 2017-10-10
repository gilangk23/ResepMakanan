package com.example.gilangk.aplikasiresepmasakan;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by cipowela on 10/10/17.
 */

public class ResepAdapter extends RecyclerView.Adapter<ResepAdapter.MyHolder> {

    private List<Resep> resepList;
    private Context c;

    public ResepAdapter(List<Resep> resepList, Context c) {
        this.resepList = resepList;
        this.c = c;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.daftar,parent,false);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, final int position) {
        holder.judulresep.setText(resepList.get(position).getJudul());
        holder.isiresep.setText(resepList.get(position).getIsi());
        holder.resep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(c, Makanan.class);
                intent.putExtra("isi",resepList.get(position).getIsi());
                intent.putExtra("gambar",resepList.get(position).getGambar());
                c.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return resepList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        private TextView judulresep , isiresep;
        private LinearLayout resep;
        public MyHolder(View itemView) {
            super(itemView);
            judulresep=(TextView)itemView.findViewById(R.id.judul);
            isiresep=(TextView)itemView.findViewById(R.id.isi);
            resep=(LinearLayout)itemView.findViewById(R.id.resep);

        }
    }
}
