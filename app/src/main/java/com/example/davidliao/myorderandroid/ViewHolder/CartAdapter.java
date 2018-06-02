package com.example.davidliao.myorderandroid.ViewHolder;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.amulyakhare.textdrawable.TextDrawable;
import com.example.davidliao.myorderandroid.Common.Common;
import com.example.davidliao.myorderandroid.Interface.ItemClickListener;
import com.example.davidliao.myorderandroid.Model.Order;
import com.example.davidliao.myorderandroid.R;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

class CartViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnCreateContextMenuListener {

    public TextView text_cartname, text_cartprice;
    public ImageView cartitemcount;

    private ItemClickListener itemClickListener;

    public void setTextcartname(TextView textcartname) {
        this.text_cartname = textcartname;
    }

    public CartViewHolder(View itemView) {
        super(itemView);
        text_cartname = (TextView) itemView.findViewById(R.id.cart_item_name);
        text_cartprice = (TextView) itemView.findViewById(R.id.cart_item_price);
        cartitemcount = (ImageView) itemView.findViewById(R.id.cart_item_count);

        itemView.setOnCreateContextMenuListener(this);
    }

    @Override
    public void onClick(View view) {

    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            menu.setHeaderTitle("Select Action");
            menu.add(0,0,getAdapterPosition(), Common.DELETE);
    }
}

public class CartAdapter extends RecyclerView.Adapter<CartViewHolder> {

    private List<Order> listData = new ArrayList<>();
    private Context context;

    public CartAdapter(List<Order> listData, Context context) {
        this.listData =listData;
        this.context = context;
    }

    @Override
    public CartViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View itemView = inflater.inflate(R.layout.cart_layout,parent, false);
        return new CartViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CartViewHolder holder, int position) {
        TextDrawable drawable = TextDrawable.builder().buildRound(""+listData.get(position).getQuantity(), Color.BLACK);
        holder.cartitemcount.setImageDrawable(drawable);

        Locale locale = new Locale("en","US");
        NumberFormat fmt = NumberFormat.getCurrencyInstance(locale);
        int price = (Integer.parseInt(listData.get(position).getPrice()))*(Integer.parseInt(listData.get(position).getQuantity()));
        holder.text_cartprice.setText(fmt.format(price));

        holder.text_cartname.setText(listData.get(position).getProductName());
    }

    @Override
    public int getItemCount() {
        return listData.size();

    }

}