package com.codersfield.foodgram.Fragment;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.codersfield.foodgram.R;

public class FullScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);
        Bundle extras = getIntent().getExtras();
String profile_URL = extras.getString("url_pic");
        ImageView imgDisplay;
        Button btnClose;


        imgDisplay =  findViewById(R.id.imgDisplay);
        btnClose = findViewById(R.id.btnClose);


        btnClose.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FullScreenActivity.this.finish();
            }
        });


       // imgDisplay.setImageBitmap(bmp );
        Glide.with(this).load(profile_URL).into(imgDisplay);
    }
}
