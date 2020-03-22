package com.example.lab4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.zip.Inflater;

import de.hdodenhof.circleimageview.CircleImageView;

public class ListAdapter extends RecyclerView.Adapter{
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem, parent, false);
//        RecycleViewHolder holder = new RecycleViewHolder(view);
        return new RecycleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position){
        ( (RecycleViewHolder) holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return OurData.name.length;
    }

    class RecycleViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView name;
        private TextView phonenum;
        CircleImageView image;

        public RecycleViewHolder(View cView){
            super(cView);
            name = cView.findViewById(R.id.image_name);
            phonenum = cView.findViewById(R.id.phone_num);
            image = cView.findViewById(R.id.image);

            cView.setOnClickListener((View.OnClickListener) this);
        }

        public void bindView(int position){
            name.setText(OurData.name[position]);
            phonenum.setText(OurData.phonenum[position]);
            image.setImageResource(OurData.img[position]);
        }
        @Override
        public void onClick(View v) {

        }
    }
}
