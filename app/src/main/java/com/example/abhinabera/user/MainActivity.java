package com.example.abhinabera.user;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView profileImage, profileName, email, mobile, address;
    EditText ed_email, ed_mobile, ed_address;
    ImageView refresh, edit, save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        profileImage = (TextView) findViewById(R.id.user_profile_photo);
        profileName = (TextView) findViewById(R.id.user_profile_name);
        String name = profileName.getText().toString();
        char first = name.charAt(0);
        profileImage.setText(first + "");

        email = (TextView) findViewById(R.id.email);
        mobile = (TextView) findViewById(R.id.mobile);
        address = (TextView) findViewById(R.id.address);
        ed_email = (EditText) findViewById(R.id.ed_email);
        ed_mobile = (EditText) findViewById(R.id.ed_mobile);
        ed_address = (EditText) findViewById(R.id.ed_address);

        refresh = (ImageView) findViewById(R.id.refresh);
        edit = (ImageView) findViewById(R.id.edit);
        save = (ImageView) findViewById(R.id.save);

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed_email.setText(email.getText().toString());
                ed_mobile.setText(mobile.getText().toString());
                ed_address.setText(address.getText().toString());
                save.setVisibility(View.VISIBLE);
                edit.setVisibility(View.GONE);
                email.setVisibility(View.GONE);
                mobile.setVisibility(View.GONE);
                address.setVisibility(View.GONE);
                ed_email.setVisibility(View.VISIBLE);
                ed_mobile.setVisibility(View.VISIBLE);
                ed_address.setVisibility(View.VISIBLE);

                save.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        email.setText(ed_email.getText().toString());
                        mobile.setText(ed_mobile.getText().toString());
                        address.setText(ed_address.getText().toString());
                        save.setVisibility(View.GONE);
                        edit.setVisibility(View.VISIBLE);
                        email.setVisibility(View.VISIBLE);
                        mobile.setVisibility(View.VISIBLE);
                        address.setVisibility(View.VISIBLE);
                        ed_email.setVisibility(View.GONE);
                        ed_mobile.setVisibility(View.GONE);
                        ed_address.setVisibility(View.GONE);
                    }
                });

            }
        });
    }
}
