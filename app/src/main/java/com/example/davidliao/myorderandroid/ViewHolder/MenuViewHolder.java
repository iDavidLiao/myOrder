package com.example.davidliao.myorderandroid.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.davidliao.myorderandroid.Interface.ItemClickListener;
import com.example.davidliao.myorderandroid.R;

public class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView textMenuName;

    private ItemClickListener itemClickListener;

    public  MenuViewHolder(View itemView) {
        super(itemView);

        textMenuName = (TextView) itemView.findViewById(R.id.menuName);

        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View view) {

        itemClickListener.onClick(view, getAdapterPosition(),false ) ;

    }
}
