package com.example.davidliao.myorderandroid.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.davidliao.myorderandroid.Interface.ItemClickListener;
import com.example.davidliao.myorderandroid.R;

public class OrderViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView textOrderId, textOrderStatus, textOrderPhone, textOrderSeatAddress;

    private ItemClickListener itemClickListener;

    public OrderViewHolder(View itemView) {
        super(itemView);

        textOrderId = (TextView) itemView.findViewById(R.id.order_id);
        textOrderStatus = (TextView) itemView.findViewById(R.id.order_status);
        textOrderPhone = (TextView) itemView.findViewById(R.id.order_phone);
        textOrderSeatAddress = (TextView) itemView.findViewById(R.id.order_address_seat);

        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View view) {
        itemClickListener.onClick(view, getAdapterPosition(), false);

    }
}
