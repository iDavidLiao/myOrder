package com.example.davidliao.myorderandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.davidliao.myorderandroid.Common.Common;

public class Home extends AppCompatActivity {

    Button menuButton, cartButton, myorderButton, signoutButton;
    TextView textName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        menuButton = (Button) findViewById(R.id.menuButton);
        cartButton = (Button) findViewById(R.id.cartButton);
        myorderButton = (Button) findViewById(R.id.myOrderButton);
        signoutButton = (Button) findViewById(R.id.signoutButton);

        textName = (TextView) findViewById(R.id.textName) ;

        textName.setText(Common.currentuser.getName());

        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent menu = new Intent(Home.this, Menu.class);
                startActivity(menu);

            }
        });

        cartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cart = new Intent(Home.this, Cart.class);
                startActivity(cart);

            }
        });

        myorderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myorder = new Intent(Home.this, OrderStatus.class);
                startActivity(myorder);

            }
        });

        signoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signout = new Intent(Home.this, SignIn.class);
                signout.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(signout);

            }
        });
    }
}
